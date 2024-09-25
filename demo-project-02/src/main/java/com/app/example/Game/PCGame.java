package com.app.example.Game;

import org.springframework.stereotype.Component;

@Component
public class PCGame implements GameInteface{
    public void up() {
        System.out.println("Shoot Up");
    }

    public void down() {
        System.out.println("Shoot Down");
    }

    public void right(){
        System.out.println("Shoot Right");
    }
    public void left(){
        System.out.println("Shoot Left");
    }
}
