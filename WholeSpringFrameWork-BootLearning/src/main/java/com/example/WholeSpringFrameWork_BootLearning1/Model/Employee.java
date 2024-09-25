package com.example.WholeSpringFrameWork_BootLearning1.Model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee implements  Person{
    @Override
    public void name() {
        System.out.println("I'm a employee");
    }

    @Override
    public void age() {
        System.out.println("My age is 20");
    }

    @Override
    public void identity() {
        System.out.println("Identity is employee");
    }
}
