package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExplorationVehicleTest {
    ExplorationVehicle explorationVehicle;

    @BeforeEach
    void setUp() {
        explorationVehicle = new ExplorationVehicle();
    }

    @Test
    void should_init_explore_vehicle_successful() {
        Report report = explorationVehicle.init();
        Location initLocation = new Location(0, 0);
        assertEquals(report.getLocation(), initLocation);
        assertEquals(report.getHeading(), Heading.NORTH);
    }

    @Test
    void should_move_one_step_successful() {
        explorationVehicle.init();
        Report report = explorationVehicle.move();
        Location moveLocation = new Location(0, 1);
        assertEquals(report.getLocation(), moveLocation);
        assertEquals(report.getHeading(), Heading.NORTH);
    }

    @Test
    void should_move_three_step_successful() {
        explorationVehicle.init();
        Report report = explorationVehicle.move(3);
        Location moveLocation = new Location(0, 3);
        assertEquals(report.getLocation(), moveLocation);
        assertEquals(report.getHeading(), Heading.NORTH);
    }

    @Test
    void should_move_five_step_successful() {
        explorationVehicle.init();
        Report report = explorationVehicle.move(5);
        Location moveLocation = new Location(0, 5);
        assertEquals(report.getLocation(), moveLocation);
        assertEquals(report.getHeading(), Heading.NORTH);
    }
}
