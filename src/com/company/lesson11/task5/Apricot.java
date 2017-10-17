package com.company.lesson11.task5;

public class Apricot extends Fruit {
    private double cost;
    private String name = "Абрикос";

    public Apricot(double weight, double cost){
        super(weight);
        this.cost = cost;
    }

    public double cost(){
        return cost * this.getWeight();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
}
