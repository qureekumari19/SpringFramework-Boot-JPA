package com.example.WholeSpringFrameWork_BootLearning1;

import com.example.WholeSpringFrameWork_BootLearning1.Model.PersonRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.WholeSpringFrameWork_BootLearning1.Model")
@Configuration
public class WholeSpringFrameWork_BootLearning1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WholeSpringFrameWork_BootLearning1.class);
        context.getBean(PersonRunner.class).run();
    }
}
