package com.app.SpringBootProject.src;

public class Gamer {
    GamingConsole game;
    public Gamer(GamingConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Playing the Game: "+String.valueOf(this.game));
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
