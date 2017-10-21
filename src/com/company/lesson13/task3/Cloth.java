package com.company.lesson13.task3;

abstract class Cloth {
    private int size;
    private double cost;
    private String colore;

    Cloth(int size, double cost, String colore){
        this.size = size;
        this.colore = colore;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Размер : " + size +
                ", стоимость : " + cost +
                ", цвет : " + colore;
    }
}
