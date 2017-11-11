package com.company.lesson18;

import com.company.lesson9.Student;

import java.util.ArrayList;
import java.util.List;

public class HeavyBoxTest {
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student());
        arrayList.add(new Student());
        arrayList.add(new Student());
        HeavyBoxFound.found(arrayList);
    }


    public static class HeavyBoxFound {
        public static void found(List<Student> list) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
}
