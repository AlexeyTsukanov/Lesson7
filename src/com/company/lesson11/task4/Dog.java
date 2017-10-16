package com.company.lesson11.task4;

public class Dog extends Animal {
    public Dog(String food, String location){
        super(food, location);
    }

    public void makeNoise(){
        System.out.println("Собака шумит.");
    }

    public void eat(){
        System.out.println("Собака ест " + getFood());
    }
}
