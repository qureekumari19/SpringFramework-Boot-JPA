package com.app.example.demo_project_02;

import com.app.example.Game.GameConsole;
import com.app.example.Game.PCGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoProject02Application {

	@Bean
	public PCGame pcGame(){
		return new PCGame();
	}

	@Bean
    public GameConsole gameConsole(){
		return new GameConsole(pcGame());
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoProject02Application.class);
		context.getBean(PCGame.class).right();
		context.getBean(GameConsole.class).run();
	}

}
