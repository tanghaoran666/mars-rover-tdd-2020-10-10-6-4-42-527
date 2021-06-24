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
}
