package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CourseTest {

    Course course=new Course();

    @Test
     void hasCourse(){
        assertTrue(course.hasCoure().contains("AWS"));
    }
}