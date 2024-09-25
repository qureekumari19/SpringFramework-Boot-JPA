package com.example.demo4;

import com.example.demo4.Model.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Demo4Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo4Application.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println(context.getBean(Controller.class).getDetails());
		System.out.println(context.getBean(Controller.class).compare());
	}

}
