package com.example.fitxplore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "client_details")
public class Client extends Subscriber {

    private String weight;

    private String height;

    private int age;

    @Column(length = 1000)
    private String aboutMedication;
    private boolean medication;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAboutMedication() {
        return aboutMedication;
    }

    public void setAboutMedication(String aboutMedication) {
        this.aboutMedication = aboutMedication;
    }

    public boolean isMedication() {
        return medication;
    }

    public void setMedication(boolean medication) {
        this.medication = medication;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", age=" + age +
                ", aboutMedication='" + aboutMedication + '\'' +
                ", medication=" + medication +
                '}';
    }
}
