package com.company.lesson11.task3;

public abstract class Flower {
    private String name;
    private int term;
    private static int quantity;

    public Flower(int n){
        quantity += n;
    }

    public Flower(){}

    abstract int colculateOfCoust();

    public static void ollSails(){
        System.out.println("Всего продано цветов " + quantity);
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

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Flower.quantity = quantity;
    }
}
