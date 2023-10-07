package com.springboot.xyz.Hello;

import lombok.Getter;
import lombok.Setter;

public class UserDetails {

    private String firstName;
    private String lastName ;
    private String EmailID ;

    public String getFirstName() {
        return firstName;
    }

    public UserDetails(String firstName, String lastName, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        EmailID = emailID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", EmailID='" + EmailID + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }
}
