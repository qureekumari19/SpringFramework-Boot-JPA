package com.example.WholeSpringFrameWork_BootLearning1.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonRunner {

    @Qualifier("manager")
    Person person;

    public PersonRunner(@Qualifier("employee") Person person) {
        this.person = person;
    }

    public void run() {
        person.name();
        person.age();
        person.identity();
    }
}
