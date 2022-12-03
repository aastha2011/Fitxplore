package com.example.fitxplore.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Subscriber {
    @Id
    @NotBlank(message = "This field cannot be empty")
    @Size(min=3,max=12,message ="Username must be 3-12 characters")
    private String userName;
    @NotBlank(message = "This field cannot be empty")
    private String firstName;
    @NotBlank(message = "This field cannot be empty")
    private String lastName;
    @NotBlank(message = "This field cannot be empty")
    private String contactNumber;
    @Column(unique = true)
    @NotBlank(message = "This field cannot be empty")
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+_.-]+$")
    private String email;
    @NotBlank(message = "This field cannot be empty")
    private String password;
    @NotBlank(message = "This field cannot be empty")
    private Date dateOfBirth;
    @NotBlank(message = "This field cannot be empty")
    private Date dateOfSubscription;
    @NotBlank(message = "This field cannot be empty")
    private String sex;

    private String city;
    private String role;

    @NotBlank(message = "This field cannot be empty")
    private String country;

    private String state;

    @Column(length = 500)
    @NotBlank(message = "This field cannot be empty")
    private String address1;

    private String address2;

    private int zipCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfSubscription() {
        return dateOfSubscription;
    }

    public void setDateOfSubscription(Date dateOfSubscription) {
        this.dateOfSubscription = dateOfSubscription;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfSubscription=" + dateOfSubscription +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", role='" + role + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}