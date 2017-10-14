package com.company.Lesson11.Task3;

public class Chamomile extends Flower {
    private int costOfOne = 12;
    private int noun;

    public Chamomile(int noun) {
        super(noun);
        this.noun = noun;
    }

    public Chamomile() {
        super();
    }

    @Override
    int colculateOfCoust() {
        return noun * costOfOne;
    }
}
