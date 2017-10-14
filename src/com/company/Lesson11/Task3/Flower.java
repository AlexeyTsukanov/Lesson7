package com.company.Lesson11.Task3;

public abstract class Flower {
    private String name;
    private int term;
    private static int noun;

    public Flower(int n){
        noun += n;
    }

    public Flower(){}

    abstract int colculateOfCoust();

    public static void ollSails(){
        System.out.println("Всего продано цветов " + noun);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public static int getNoun() {
        return noun;
    }

    public static void setNoun(int noun) {
        Flower.noun = noun;
    }
}
