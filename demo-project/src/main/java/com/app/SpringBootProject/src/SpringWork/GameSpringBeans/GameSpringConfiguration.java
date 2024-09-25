package com.app.SpringBootProject.src.SpringWork.GameSpringBeans;
import com.app.SpringBootProject.src.*;

import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameSpringConfiguration {

   @Bean
    public GamingConsole gameMarioConsole() {
       System.out .println("Calling Mario");
       return new Mario();
   }

    @Bean
    @Primary
    public GamingConsole gameSuperContraConsole(){
        System.out .println("Calling superContra");
        return new superContra();
    }
    @Bean
    public Gamer game(GamingConsole game){
       return new Gamer(game);
    }

}



