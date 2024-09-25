package com.app.example.demo_project_03.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mario")
//@Primary
public class Mario implements IGame {
    @Override
    public void up() {
        System.out.println("Mario up");
    }

    @Override
    public void down() {
        System.out.println("Mario down");
    }

    @Override
    public void start() {
        System.out.println("Mario start");
    }

    @Override
    public void pause() {
        System.out.println("Mario pause");
    }
}
