package com.company.lesson11.task4;

public class Horse extends Animal {

    public Horse(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Лошадь шумит.");
    }

    public void eat() {
        System.out.println("Лошадь ест " + getFood());
    }
}
