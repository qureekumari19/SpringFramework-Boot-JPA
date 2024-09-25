package com.app.example.demo_project_03;

import com.app.example.demo_project_03.Game.GameRunner;
import com.app.example.demo_project_03.Game.IGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.app.example.demo_project_03.Game")
public class DemoProject03Application {

//	@Bean
//	public GameRunner gameRunner(IGame hello) {
//		System.out.println(hello);
//		return new GameRunner(hello);
//	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoProject03Application.class);
       // context.getBean(GameRunner.class).run();
		context.getBean(GameRunner.class).play();
	}

}
