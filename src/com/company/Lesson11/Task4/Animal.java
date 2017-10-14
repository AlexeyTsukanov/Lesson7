package com.company.Lesson11.Task4;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
    }

    public void eat() {
    }

    public void sleep() {
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
}
