package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assert (report.getLocation()).equals(initLocation);
        assert (report.getHeading()).equals(Heading.NORTH);
    }
}
