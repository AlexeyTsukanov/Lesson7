package com.company.lesson8;

public class Person {
    String fullName;
    int age;

    Person() {
    }

    Person(String f, int a) {
        fullName = f;
        age = a;
    }

    void move() {
        System.out.println(fullName + "is moving!");
    }

    void talk() {
        System.out.println(fullName + " said: \" I`m " + age + " years old\"");
    }

    @Override
    public String toString() {
        return String.format("Person: full name - %1$s, age %2$s", fullName, age);
    }
}
