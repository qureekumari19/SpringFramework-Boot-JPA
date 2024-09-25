package com.example.WholeSpringFrameWork_BootLearning2;

import com.example.WholeSpringFrameWork_BootLearning1.WholeSpringFrameWork_BootLearning1;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class WholeSpringFrameWork_BootLearning2Test {


    WholeSpringFrameWork_BootLearning1 ws = new WholeSpringFrameWork_BootLearning1();
    WholeSpringFrameWork_BootLearning1 ws1;

    @Test
    @BeforeEach
    public void run(){
        assertNotNull(ws);
    }
}