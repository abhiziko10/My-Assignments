package com.example.FirstCollaborationProject.CricketerManagementSystem.entities;

public class Cricketers {
    private int cricketerID;
    private String cricketerName;
    private String cricketerCountry;
    private String cricketerType;
    private String cricketerExperience;
    private String cricketerClub;

    public Cricketers(int cricketerID, String cricketerName, String cricketerCountry, String cricketerType,
                      String cricketerExperience, String cricketerClub) {
        this.cricketerID = cricketerID;
        this.cricketerName = cricketerName;
        this.cricketerCountry = cricketerCountry;
        this.cricketerType = cricketerType;
        this.cricketerExperience = cricketerExperience;
        this.cricketerClub = cricketerClub;
    }
    public Cricketers(){}

    public int getCricketerID() {
        return cricketerID;
    }

    public void setCricketerID(int cricketerID) {
        this.cricketerID = cricketerID;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public String getCricketerCountry() {
        return cricketerCountry;
    }

    public void setCricketerCountry(String cricketerCountry) {
        this.cricketerCountry = cricketerCountry;
    }

    public String getCricketerType() {
        return cricketerType;
    }

    public void setCricketerType(String cricketerType) {
        this.cricketerType = cricketerType;
    }

    public String getCricketerExperience() {
        return cricketerExperience;
    }

    public void setCricketerExperience(String cricketerExperience) {
        this.cricketerExperience = cricketerExperience;
    }

    public String getCricketerClub() {
        return cricketerClub;
    }

    public void setCricketerClub(String cricketerClub) {
        this.cricketerClub = cricketerClub;
    }

    @Override
    public String toString() {
        return "Cricketers{" +
                "cricketerID='" + cricketerID + '\'' +
                ", cricketerName='" + cricketerName + '\'' +
                ", cricketerCountry='" + cricketerCountry + '\'' +
                ", cricketerType='" + cricketerType + '\'' +
                ", cricketerExperience='" + cricketerExperience + '\'' +
                ", cricketerClub='" + cricketerClub + '\'' +
                '}';
    }
}
