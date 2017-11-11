package com.company.lesson18;

import com.company.lesson8.Person;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>();
        people.add(new Person("Petya", 31));
        people.add(new Person("Vasya", 21));
        people.add(new Person("Dima", 11));

        for (Person person : people){
            System.out.println(person);
        }
    }
}
