package com.company.lesson11.task5;

public class Pear extends Fruit {
    private double cost;
    private String name = "Груша";

    public Pear(double weight, double cost) {
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

        Pear pear = (Pear) o;

        if (Double.compare(pear.cost, cost) != 0) return false;
        return name != null ? name.equals(pear.name) : pear.name == null;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
