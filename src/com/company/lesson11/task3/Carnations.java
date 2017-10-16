package com.company.lesson11.task3;

public class Carnations extends Flower {
    private int costOfOne = 13;
    private int quantity;

    public Carnations(int quantity){
        super(quantity);
        this.quantity = quantity;
    }

    public Carnations(){}

    @Override
    int colculateOfCoust() {
        return quantity * costOfOne;
    }
}
