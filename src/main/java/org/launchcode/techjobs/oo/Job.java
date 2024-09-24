package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();

        if (name.isBlank() && employer.toString().isBlank() && location.toString().isBlank() && positionType.toString().isBlank() && coreCompetency.toString().isBlank()) {
            return "OOPS! This job does not seem to exist.";
        }
        if (name.isBlank()) {
            setName("Data not available");
        }
        if (employer.toString().isBlank()) {
            getEmployer().setValue("Data not available");
        }
        if (location.toString().isBlank()) {
            getLocation().setValue("Data not available");
        }
        if (positionType.toString().isBlank()) {
            getPositionType().setValue("Data not available");
        }
        if (coreCompetency.toString().isBlank()) {
            getCoreCompetency().setValue("Data not available");
        }

        return newLine +
                "ID: " + getId() + "\r\n" +
                "Name: " + getName() + "\r\n" +
                "Employer: " + getEmployer() + "\r\n" +
                "Location: " + getLocation() + "\r\n" +
                "Position Type: " + getPositionType() + "\r\n" +
                "Core Competency: " + getCoreCompetency() +
                newLine;
    }

}
