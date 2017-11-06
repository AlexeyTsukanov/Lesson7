package com.company.lesson16.Task5;

public class FoodTest {
    public static void main(String[] args) {
        Food f = new Food();
        Cookable c = new Cookable() {
            @Override
            public void cook() {
                System.out.println("I`m cooking!");
            }
        };
        f.prepare(c);
    }
}
