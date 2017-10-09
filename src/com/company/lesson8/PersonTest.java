package com.company.lesson8;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alexey", 21);
        person1.move();
        person2.talk();
    }
}
