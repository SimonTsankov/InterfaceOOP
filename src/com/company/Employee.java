package com.company;

public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    public Employee(String first, String last, String id){
        firstName=first;
        lastName=last;
        socialSecurityNumber=id;
    }
    public Employee(){

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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String toString(){

        return String.format("%s %s\nsocial security number: %s", getFirstName(),getLastName(),getSocialSecurityNumber()
        );
    }
}
