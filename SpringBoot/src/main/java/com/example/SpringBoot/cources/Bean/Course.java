package com.example.SpringBoot.cources.Bean;

public class Course {
    private int id;
    private String courseName;
    private String authorName;

    public Course(int id, String courseName, String authorName) {
        this.id = id ;
        this.courseName = courseName;
        this.authorName = authorName;
    }
    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + "/n" +", courseName=" + courseName +  "/n" +", authorName=" + authorName  + "}";
    }
}
