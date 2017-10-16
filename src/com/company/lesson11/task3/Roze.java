package com.company.lesson11.task3;

public class Roze extends Flower {
    private int costOfOne = 14;
    private int quantity;

    public Roze(int quantity){
        super(quantity);
        this.quantity = quantity;
    }

    public Roze(){}

    @Override
    int colculateOfCoust() {
        return quantity * costOfOne;
    }

    public int getCostOfOne() {
        return costOfOne;
    }

    public void setCostOfOne(int costOfOne) {
        this.costOfOne = costOfOne;
    }
}
