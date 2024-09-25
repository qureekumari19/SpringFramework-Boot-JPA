package com.example.XMLConfiguration;

import com.example.XMLConfiguration.Model.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class XMLRunner {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(XMLRunner.class); //This is use to launch a java ConfigurationFile
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
        //System.out.println(context.getBean("mario"));
        context.getBean(GameRunner.class).run();
    }
}
