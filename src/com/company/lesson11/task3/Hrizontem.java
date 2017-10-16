package com.company.lesson11.task3;

public class Hrizontem extends Flower {
    private int costOfOne = 11;
    private int quantity;

    public Hrizontem(int quantity) {
        super(quantity);
        this.quantity = quantity;
    }

    public Hrizontem() {}

    @Override
    int colculateOfCoust() {
        return quantity * costOfOne;
    }
}
