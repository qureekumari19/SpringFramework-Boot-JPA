package com.app.SpringBootProject.src.SpringWork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpring {
    public static void main(String[] args) {
        //1. Launch the spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2. Configure the thing that we want spring to manage - @Configuration
        // Created HelloWorldConfiguration
        //name - @Bean

        //3. Retrieving Beans Managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address")); //changing the Bean name
        System.out.println(context.getBean(PlaceDetails.class)); //getting context by the type of the Bean
        System.out.println(context.getBean("ExsitingBeanUseperson"));
        System.out.println(context.getBean("human"));
        System.out.println(context.getBean("human1"));
        System.out.println(context.getBean(Human.class));
        System.out.println(context.getBean("personDetails"));

        System.out.println("These are multiple existing Beans");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(ele->System.out.println(ele));
    }
}
