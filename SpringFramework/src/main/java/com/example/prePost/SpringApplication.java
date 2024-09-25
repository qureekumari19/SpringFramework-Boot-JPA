package com.example.prePost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class someClass {
    someDependency sd;
    public someClass(someDependency sd){
        this.sd = sd;
        System.out.println("someClass");
    }

    @PostConstruct
    public void initialization(){
        System.out.println("Initializing someClass");
        sd.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("cleanUp the instance");
    }

}

@Component
class someDependency{

    public void getReady() {
        System.out.println("someDependency");
    }
}

@Configuration
@ComponentScan
public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class);
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.getBean(someClass.class);

        context.close();
    }
}
