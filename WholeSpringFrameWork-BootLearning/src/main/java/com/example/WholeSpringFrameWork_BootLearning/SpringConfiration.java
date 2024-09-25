package com.example.WholeSpringFrameWork_BootLearning;

import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

record PersonDetails(String name, int age){ };

@Configuration
@ComponentScan
public class SpringConfiration {

    @Bean
    public String person() {
        return "Hello Quree";
    }

    @Bean
     PersonDetails personDetails() {
        return new PersonDetails("Quree",1);
    }

    @Bean
    @Primary
     Person person1() {
        return new Person("Kali",2);
    }

    @Bean
    @Lazy
    Person person2() {
        return new Person("Ravi",2);
    }

    @Bean
    @Primary
    PersonDetails personDetails3() {
        return new PersonDetails("Krit",3);
    }

}
