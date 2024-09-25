package com.app.example.Game;

import org.springframework.stereotype.Component;

import javax.management.ConstructorParameters;

@Component
public class GameConsole {
    PCGame game;
    public GameConsole(PCGame game) {
         this.game=new PCGame();
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
