package com.app.example.demo_project_03.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

   @Autowired @Qualifier("superContra")
   IGame iGame;
    @Qualifier("Mario")
    IGame iGame1;
//    public GameRunner(@Qualifier("superContra") IGame iGame) {
//
//        this.iGame=iGame;
//    }

    public GameRunner(@Qualifier("Mario") IGame iGame1) {
        this.iGame1=iGame1;
    }

//    public void run(){
//        System.out.println("Game is starting...");
//        iGame.up();
//        iGame.down();
//        iGame.start();
//        iGame.pause();
//    }

    public void play(){
        System.out.println("Game is starting...");
        iGame1.up();
        iGame1.down();
        iGame1.start();
        iGame1.pause();
    }
}
