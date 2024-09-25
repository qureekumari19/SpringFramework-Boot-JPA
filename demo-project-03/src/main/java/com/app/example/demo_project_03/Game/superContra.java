package com.app.example.demo_project_03.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContra")
//@Primary
public class superContra implements IGame {
    @Override
    public void up() {
        System.out.println("superContra Jump");
    }

    @Override
    public void down() {
        System.out.println("superContra Sit Down! Don't fire");
    }

    @Override
    public void start() {
        System.out.println("superContra Move");
    }

    @Override
    public void pause() {
        System.out.println("superContra Pause");
    }
}
