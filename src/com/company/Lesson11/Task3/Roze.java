package com.company.Lesson11.Task3;

public class Roze extends Flower {
    private int costOfOne = 14;
    private int noun;

    public Roze(int noun){
        super(noun);
        this.noun = noun;
    }

    public Roze(){
        super();
    }

    @Override
    int colculateOfCoust() {
        return noun * costOfOne;
    }

    public int getCostOfOne() {
        return costOfOne;
    }

    public void setCostOfOne(int costOfOne) {
        this.costOfOne = costOfOne;
    }
}
