package com.example.WholeSpringFrameWork_BootLearning1.Model;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Person{
    @Override
    public void name() {
        System.out.println("I'm a Manager");
    }

    @Override
    public void age() {
        System.out.println("My age is 40");
    }

    @Override
    public void identity() {
        System.out.println("Identity is Manager");
    }
}
