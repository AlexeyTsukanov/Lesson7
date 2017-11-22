package com.company.lesson20.InternetShop;


public class Product{
    private String name;
    private double cost;
    private double rating;

    public Product(String name, double cost, double rating){
        this.cost = cost;
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", cost = " + cost +
                ", rating = " + rating;
    }
}
