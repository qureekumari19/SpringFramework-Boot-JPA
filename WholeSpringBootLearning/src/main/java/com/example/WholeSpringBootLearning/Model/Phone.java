package com.example.WholeSpringBootLearning.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Phone {

    @Id
    private int number;
    private String type;
    private String model;
    public Phone(int number, String type, String model) {
        this.number = number;
        this.type = type;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone() {
    }
}
