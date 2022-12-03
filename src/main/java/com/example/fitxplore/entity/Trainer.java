package com.example.fitxplore.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "trainer_details")
public class Trainer extends Subscriber{

    @NotBlank(message = "This field cannot be empty")
    private String image;
    @NotBlank(message = "This field cannot be empty")
    private String workoutType;
    @NotBlank(message = "This field cannot be empty")
    private String achievementsFile;
    @NotBlank(message = "This field cannot be empty")
    @Column(length = 1000)
    private String description;
    private int workExperience;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public String getAchievementsFile() {
        return achievementsFile;
    }

    public void setAchievementsFile(String file) {
        this.achievementsFile = file;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainer trainer)) return false;
        if (!super.equals(o)) return false;
        return getWorkExperience() == trainer.getWorkExperience() && Objects.equals(getImage(), trainer.getImage()) && Objects.equals(getWorkoutType(), trainer.getWorkoutType()) && Objects.equals(getAchievementsFile(), trainer.getAchievementsFile()) && Objects.equals(getDescription(), trainer.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getImage(), getWorkoutType(), getAchievementsFile(), getDescription(), getWorkExperience());
    }
    @Override
    public String toString() {
        return "Trainer{" +
                "userName='" + getUserName()+ '\'' +
                ", FirstName='" + getFirstName() + '\'' +
                ", LastName='" + getLastName() + '\'' +
                ", contactNumber='" + getContactNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", sex='" + getSex() + '\'' +
                ", city='" + getCity() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", state='" + getState() + '\'' +
                ", address1='" + getAddress1() + '\'' +
                ", address2='" + getAddress2() + '\'' +
                ", zipCode=" + getZipCode() +
                "image='" + image + '\'' +
                ", workoutType='" + workoutType + '\'' +
                ", achievementsFile='" + achievementsFile + '\'' +
                ", description='" + description + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
