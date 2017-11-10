package com.company.lesson11.task5;

public class Apricot extends Fruit {
    private double cost;
    private String name = "Абрикос";

    public Apricot(double weight, double cost) {
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

        Apricot apricot = (Apricot) o;

        if (this.getWeight() != ((Fruit) o).getWeight()) return false;
        if (Double.compare(apricot.cost, cost) != 0) return false;
        return name != null ? name.equals(apricot.name) : apricot.name == null;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "cost=" + cost + "weight=" + this.getWeight() +
                ", name='" + name + '\'' +
                '}';
    }
}
