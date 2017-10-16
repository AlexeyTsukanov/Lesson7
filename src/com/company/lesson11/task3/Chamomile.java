package com.company.lesson11.task3;

public class Chamomile extends Flower {
    private int costOfOne = 12;
    private int quantity;

    public Chamomile(int quantity) {
        super(quantity);
        this.quantity = quantity;
    }

    public Chamomile(){}

    @Override
    int colculateOfCoust() {
        return quantity * costOfOne;
    }
}
