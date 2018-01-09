package com.example.data;

public class Actor {

    private String firstName;
    private String lastName;
    private String country;

    public Actor() {
    }

    public Actor(String firstName, String lastName, String country) {
        setFirstName(firstName);
        setLastName(lastName);
        setCountry(country);
    }

    public void showActorInfo() {
        System.out.printf("Imię: %s , nazwisko: %s , kraj: %s,\n", getFirstName(),
                getLastName(), getCountry());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
