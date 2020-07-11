package org.launchcode.techjobs_oo;

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
    public Job(){
        id=nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer = employer;
        this.location = location;
        this.positionType=positionType;
        this.coreCompetency= coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        if(name=="" && employer.getValue()==null && location.getValue()==null && positionType.getValue()==null && coreCompetency.getValue()==null){
            return "OOPS! This job does not seem to exist.";
        }
        if(name==""){
            return "\n" +
                    "ID: " + id +
                    "\nName: Data not available"+
                    "\nEmployer: " + employer +
                    "\nLocation: " + location +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency +
                    '\n';
        }else if(employer.getValue()==null || employer.getValue()==""){
            return "\n" +
                    "ID: " + id +
                    "\nName: " + name +
                    "\nEmployer: Data not available" +
                    "\nLocation: " + location +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency +
                    '\n';
        }else if(location.getValue()==null || location.getValue()==""){
            return "\n" +
                    "ID: " + id +
                    "\nName: " + name +
                    "\nEmployer: " + employer +
                    "\nLocation: Data not available" +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency +
                    '\n';
        } else if(positionType.getValue()==null || positionType.getValue()==""){
            return "\n" +
                    "ID: " + id +
                    "\nName: " + name +
                    "\nEmployer: " + employer +
                    "\nLocation:" + location +
                    "\nPosition Type: Data not available" +
                    "\nCore Competency:" + coreCompetency +
                    '\n';
        }else if(coreCompetency.getValue()==null || coreCompetency.getValue()==""){
            return "\n" +
                    "ID: " + id +
                    "\nName: " + name +
                    "\nEmployer: " + employer +
                    "\nLocation: " + location +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: Data not available" +
                    '\n';
        } else {
            return "\n" +
                    "ID: " + id +
                    "\nName: " + name +
                    "\nEmployer: " + employer +
                    "\nLocation: " + location +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency +
                    '\n';
        }

    }
// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

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
}
