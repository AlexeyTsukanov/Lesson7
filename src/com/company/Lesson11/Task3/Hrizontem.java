package com.company.Lesson11.Task3;

public class Hrizontem extends Flower {
    private int costOfOne = 11;
    private int noun;

    public Hrizontem(int noun) {
        super(noun);
        this.noun = noun;
    }

    public Hrizontem() {
        super();
    }

    @Override
    int colculateOfCoust() {
        return noun * costOfOne;
    }
}
