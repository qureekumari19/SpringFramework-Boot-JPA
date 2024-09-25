package com.example.Spring_JPA.Hibernet.Course.JDBC;

public class Course {
    private long id;
    private String name;
    private String author;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public Course() {
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Author: " + author;
    }
}
