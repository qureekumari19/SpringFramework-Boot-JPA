package com.app.SpringBootProject.src;

public class superContra implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jumb Up");
    }

    @Override
    public void down() {
        System.out.println("Sit Down");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Shoot Bullet");
    }
}
