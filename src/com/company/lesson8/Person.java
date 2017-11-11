package com.company.lesson8;

public class Person implements Comparable<Person> {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String f, int a) {
        fullName = f;
        age = a;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
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

    @Override
    public int compareTo(Person o) {
        int personAge = o.getAge();
        return this.age - personAge;
    }
}
