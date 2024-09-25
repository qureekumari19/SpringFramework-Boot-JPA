package org.example;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CalculateSumTest {

    private CalculateSum calculateSum = new CalculateSum();
    List<String> list= Arrays.asList("AWS","Azure","Guice","Spring");

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforEach");

    }

    @Test
    void calculateSumTest() {
//        System.out.println("Sum is: "+calculateSum.calSum(new int[]{1,2,3,4,5}));
       assertEquals(calculateSum.calSum(new int[]{1,2,3,4,5}),15);
        System.out.println("Success of the JUnit Test");
//       fail("Not implemented yet");   //absence of failure is success
    }

    @Test
    void calculateSumTest1() {
        assertEquals(calculateSum.calSum(new int[]{}),0);
        System.out.println("Success of the JUnit Test");
    }

    @Test
    void ArrayTest() {
        assertTrue(list.contains("AWS"));
        assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
        System.out.println("Success of the JUnit Test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }


}