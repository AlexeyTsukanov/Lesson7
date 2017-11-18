package com.company.lesson20;

public class Student {
    private String name;
    private int course;
    private String group;
    private int[] marks;

    public Student(String name, String group, int course, int[] marks){
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMiddleMark(){
        int a = 0;
        for (int i : marks){
            a += i;
        }
        return a/marks.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
