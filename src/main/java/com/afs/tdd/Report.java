package com.afs.tdd;

public class Report {
    private final Location location;
    private final Heading heading;

    public Report(Location location, Heading heading) {
        this.location = location;
        this.heading = heading;
    }

    public Location getLocation() {
        return this.location;
    }

    public Heading getHeading() {
        return this.heading;
    }
}
