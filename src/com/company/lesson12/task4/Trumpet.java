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

    @Override
    public String toString() {
        return "Труба" +
                "диаметр = " + diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return Double.compare(trumpet.diameter, diameter) == 0;
    }
}
