package com.company.lesson12.task4;

public class Trumpet implements Instrument {
    private double diameter;

    public Trumpet(double diameter){
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент труба с диаметром " + diameter);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
