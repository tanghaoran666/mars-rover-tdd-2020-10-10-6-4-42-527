package com.afs.tdd;

public class ExplorationVehicle {
    private Location location;
    private Heading heading;

    public Report init() {
        this.location = new Location(0, 0);
        this.heading = Heading.NORTH;
        return generateReport();
    }

    public Report move() {
        this.location = new Location(0, 1);
        return generateReport();
    }

    private Report generateReport() {
        return new Report(this.location, this.heading);
    }

    public Report move(int step) {
        return null;
    }
}
