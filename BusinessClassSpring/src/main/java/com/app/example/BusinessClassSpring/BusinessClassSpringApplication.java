package com.app.example.BusinessClassSpring;


import com.app.example.BusinessClassSpring.Model.DataService;
import com.app.example.BusinessClassSpring.Model.DatabaseSystem;
import com.app.example.BusinessClassSpring.Model.MongoDBResult;
import com.app.example.BusinessClassSpring.Model.MySQLResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessClassSpringApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessClassSpringApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBeanDefinitionCount());
		context.getBean(DatabaseSystem.class).run();
		System.out.println(context.getBean(DatabaseSystem.class).findMax());
	}
}
