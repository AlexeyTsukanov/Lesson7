package com.company.Lesson11.Task1;

public class Student {
    private String fullName;
    private String grup;

    public Student(String fullName, String grup) {
        this.fullName = fullName;
        this.grup = grup;
    }

    public Student() {
    }

    public int getScholarship(){
        return 100;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }
}
