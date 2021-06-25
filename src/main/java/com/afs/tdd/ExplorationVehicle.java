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
        this.location.addYAxis(step);
        return generateReport();
    }

    public Report turn(Direction direction) {
        Heading newHeading;
        if (direction == Direction.RIGHT) {
            if (this.heading == Heading.WEST) {
                newHeading = Heading.NORTH;
            } else {
                newHeading = Heading.fromValue(this.heading.getValue() + 1);
            }
        } else {
            if (this.heading == Heading.NORTH) {
                newHeading = Heading.WEST;
            } else {
                newHeading = Heading.fromValue(this.heading.getValue() - 1);
            }
        }
        this.heading = newHeading;
        return generateReport();
    }
}
