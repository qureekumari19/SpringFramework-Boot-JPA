package com.example.XMLConfiguration.Model;


import org.springframework.stereotype.Component;

//@Component
public class Mario implements IGame {
    String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Mario is playing");
    }
}
