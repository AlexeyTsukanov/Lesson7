package com.company.lesson12.task4;

public class Drum implements Instrument {
    private double size;

    public Drum(double size){
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент барабан с размером " + size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
