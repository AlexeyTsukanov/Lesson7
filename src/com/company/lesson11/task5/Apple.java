package com.company.lesson11.task5;

public class Apple extends Fruit {
    private double cost;
    private String name = "Яблоко";

    public Apple(double weight, double cost) {
        super(weight);
        this.cost = cost;
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

    public double cost() {
        return cost * this.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        if (this.getWeight() != ((Fruit) o).getWeight()) return false;
        if (Double.compare(apple.cost, cost) != 0) return false;
        return name != null ? name.equals(apple.name) : apple.name == null;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "cost=" + cost + "weight=" + this.getWeight() +
                ", name='" + name + '\'' +
                '}';
    }
}
