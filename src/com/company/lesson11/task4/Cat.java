package com.company.lesson11.task4;

public class Cat extends Animal {
    public Cat(String food, String location){
        super(food, location);
    }

    public void makeNoise(){
        System.out.println("Кошка шумит");
    }

    public void eat(){
        System.out.println("Кошка ест " + getFood());
    }
}
