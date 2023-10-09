package com.springboot.xyz.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "USERDETAILS")
public class UserDetails {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_name", length = 50, nullable = false, unique = true)
    private String UserName;
    private String firstName;
    private String LastName;
    private String email;
    private String role;
    @Column(name = "ssn", length = 50, nullable = false, unique = true)
    private String ssn;

    public UserDetails() {
    }

    public UserDetails(Long id, String userName, String firstName, String lastName, String email, String role, String ssn) {
        this.id = id;
        UserName = userName;
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.role = role;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
