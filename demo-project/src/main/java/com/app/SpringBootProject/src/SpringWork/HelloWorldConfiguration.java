package com.app.SpringBootProject.src.SpringWork;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age){ };
record Human(String name, int age, PlaceDetails placeDetails){ };
record PlaceDetails(String state, String city){ };
record Details(String name, int age, Person person){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Welcome to SpringBoot Quree";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
     Human human(){
        return new Human("Quree", 26, new PlaceDetails("Karnataka","Bangalore"));
    }

    @Bean//Wiring with Parameter
    @Primary
     Human human1(String name, int age, PlaceDetails placeDetails){
        return new Human(name,age, placeDetails);
    }

    @Bean//Wiring with Parameter
    Human human2(String name, int age, PlaceDetails placeDetails1){
        return new Human(name,age, placeDetails1);
    }

    @Bean//Wiring with Parameter
    Details personDetails(String name, int age, @Qualifier("person1Details")Person person){
        return new Details(name, age, person);
    }

    @Bean
    Person person(){
        return new Person("Quree",26);
    }

    @Bean//Wiring with Method call
    Person ExsitingBeanUseperson(){
        return new Person(name(),age());
    }

    @Bean
    @Qualifier("person1Details")
    Person ExsitingBeanUsePerson1(){
        return new Person(name(),age());
    }

    @Bean(name = "address")
     PlaceDetails placeDetails(){
        return new PlaceDetails("Karnataka","Bangalore");
    }
}
