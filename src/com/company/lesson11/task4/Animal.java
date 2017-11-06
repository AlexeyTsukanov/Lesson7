package com.company.lesson11.task4;

import java.io.Serializable;

public class Animal implements Serializable {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное шумит.");
    }

    public void eat() {
        System.out.println("Животное ест " + food);
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "корм - '" + food + '\'' +
                ", живет " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (food != null ? !food.equals(animal.food) : animal.food != null) return false;
        return location != null ? location.equals(animal.location) : animal.location == null;
    }
}
