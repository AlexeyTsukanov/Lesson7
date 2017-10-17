package com.company.lesson11.task5;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight){
        this.weight = weight;
    }

    final void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    abstract public double cost();

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
