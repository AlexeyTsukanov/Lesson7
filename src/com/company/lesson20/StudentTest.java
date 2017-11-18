package com.company.lesson20;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> allStudents = new LinkedList<>();
        allStudents.add(new Student("Petya", "MO-1",1, new int[]{3, 2, 3, 5, 4}));
        allStudents.add(new Student("Vasya", "EP-4",2, new int[]{2, 2, 3, 2, 2}));
        allStudents.add(new Student("Styopa", "IT-1",1, new int[]{5, 4, 4, 5, 5}));
        allStudents.add(new Student("Vanya", "RO-3",3, new int[]{3, 2, 3, 5, 4}));

        List<Student> studentsOnNextCourse = StudentTest.checkForPerformance(allStudents);
        System.out.println(studentsOnNextCourse);
        StudentTest.printStudent(allStudents,2);
    }

    private static List<Student> checkForPerformance(List<Student> list){
        Iterator<Student> iterator = list.iterator();
        List<Student> students = new LinkedList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getMiddleMark() >= 3){
                student.setCourse(student.getCourse() + 1);
                students.add(student);
            }
        }
        return students;
    }

    private static void printStudent(List<Student> students, int course){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }
}
