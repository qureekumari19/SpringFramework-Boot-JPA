package com.example.WholeSpringFrameWork_BootLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class WholeSpringFrameWorkBootLearningApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiration.class);
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("personDetails"));
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean(Person.class).getName());
		System.out.println(context.getBean(PersonDetails.class));
	}

}
