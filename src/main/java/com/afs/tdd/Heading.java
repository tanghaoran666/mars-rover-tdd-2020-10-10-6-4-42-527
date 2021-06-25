package com.afs.tdd;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public enum Heading {
    NORTH(1),
    EAST(2),
    SOUTH(3),
    WEST(4);

    private int value;

    Heading(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Heading fromValue(int value) {
        return Stream.of(Heading.values())
                .filter(heading -> heading.getValue() == value).findFirst()
                .orElseThrow(() ->new RuntimeException("invalid heading value"));
    }

    Heading turnLeft() {
        Heading newHeading;
        if (this == NORTH) {
            newHeading = WEST;
        } else {
            newHeading = fromValue(getValue() - 1);
        }
        return newHeading;
    }

    Heading turnRight() {
        Heading newHeading;
        if (this == WEST) {
            newHeading = NORTH;
        } else {
            newHeading = fromValue(getValue() + 1);
        }
        return newHeading;
    }
}
