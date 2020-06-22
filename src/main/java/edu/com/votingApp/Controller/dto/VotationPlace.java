package edu.com.votingApp.Controller.dto;

public class VotationPlace {

    /*private enum name {ROBLEDO, BELLO, SOACHA}
    private enum direction {UDEA_ROBLEDO, TULIO_OSPINA, UNIVERSIDAD_DE_CUNDINAMARCA}
    private enum municipality {MEDELLIN, BELLO, SOACHA}
    private enum department {ANTIOQUIA, CUNDINAMARCA}
    private enum country {COLOMBIA}*/

    private String name;
    private String direction;
    private String municipality;
    private String department;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
