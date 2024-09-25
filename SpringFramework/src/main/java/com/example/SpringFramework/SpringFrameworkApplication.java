package com.example.SpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class classA{
}

@Component
class classB{
   classA a;

	public classB(classA a) {
		System.out.println("classB");
		this.a = a;
	}
}


@Configuration
@ComponentScan
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringFrameworkApplication.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
