package com.company.Lesson11.Task3;

public class Carnations extends Flower {
    private int costOfOne = 13;
    private int noun;

    public Carnations(int noun){
        super(noun);
        this.noun = noun;
    }

    public Carnations(){
        super();
    }

    @Override
    int colculateOfCoust() {
        return noun * costOfOne;
    }
}
