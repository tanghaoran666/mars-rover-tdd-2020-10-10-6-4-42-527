package com.afs.tdd;

public class Report {
    private Location location;
    private Heading heading;

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
