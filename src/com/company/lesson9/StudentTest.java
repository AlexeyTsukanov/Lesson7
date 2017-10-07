package com.company.lesson9;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[7];

        students[0] = new Student("Ivanov Ivan Ivanovich", 123, "IT-21", "14.11.1995", "0674890317");
        Student student = students[0];
        student.takeBook();
        student.returnBook();
        students[1] = new Student("Ivanov Dima Ivanovich", 123, "IT-21", "15.11.1995", "0674890546");
        Student student1 = students[1];
        student1.takeBook();
        student1.returnBook();
        student.infoReturn();
        student1.infoTake();
    }
}
