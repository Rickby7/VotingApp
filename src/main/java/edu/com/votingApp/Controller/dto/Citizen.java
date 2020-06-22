package edu.com.votingApp.Controller.dto;

import java.util.ArrayList;
import java.util.List;

public class Citizen {
    private String name;
    private String lastName;
    private int age;
    private Gender gender;
    private int documentNumber;
    private List <VotationPlace> votationPlace;
    private int id;
    private Integer vote;

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public List<VotationPlace> getVotationPlace() {
        return votationPlace;
    }

    public void setVotationPlace(List<VotationPlace> votationPlace) {
        this.votationPlace = votationPlace;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public Gender getGender() { return gender; }

    public void setGender(Gender gender) { this.gender = gender; }

    public int getDocumentNumber() { return documentNumber; }

    public void setDocumentNumber(int documentNumber) { this.documentNumber = documentNumber; }
}
