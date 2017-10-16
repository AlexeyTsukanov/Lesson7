package com.company.lesson11.task1;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student student1 = new Student("Dima Sidorov", "EL - 7");
        students[0] = student1;
        Student student2 = new Aspirant("Petya Ivanov", "EP - 5", "some work");
        students[1] = student2;
        Aspirant student3 = new Aspirant("Genya Petrov", "KN - 6", "some work");
        students[2] = student3;

        for (Student student : students){
            System.out.println(student.getScholarship());
        }
    }
}
