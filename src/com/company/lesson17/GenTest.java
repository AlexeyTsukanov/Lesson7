package com.company.lesson17;

import com.company.lesson11.task4.Animal;

public class GenTest {
    public static void main(String[] args) {
        Animal a = new Animal("", "");
        Gen gen = new Gen<>(88, a, 13.5);
        gen.showTipe();
    }
}
