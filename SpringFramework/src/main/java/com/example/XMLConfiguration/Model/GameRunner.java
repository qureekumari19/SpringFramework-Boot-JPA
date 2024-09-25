package com.example.XMLConfiguration.Model;

import org.springframework.stereotype.Component;

//@Component
public class GameRunner {
    IGame game;
    public GameRunner(IGame game) {
        System.out.println("Constructor Dependency Injection");
        this.game = game;
        System.out.println("Game: "+game);
    }

    public void run(){
        game.play();
    }
}
