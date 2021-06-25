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
        this.heading = getNewHeading(direction);
        return generateReport();
    }

    private Heading getNewHeading(Direction direction) {
        Heading newHeading;
        if (direction == Direction.RIGHT) {
            newHeading = heading.turnRight();
        } else {
            newHeading = heading.turnLeft();
        }
        return newHeading;
    }

}
