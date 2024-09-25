package com.app.SpringBootProject.src.SpringWork.GameSpringBeans;
import com.app.SpringBootProject.src.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameSpringBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameSpringConfiguration.class);
        context.getBean(GamingConsole.class).down();
        System.out .println("Calling Gamer");
        context.getBean(Gamer.class).run();

    }
}
