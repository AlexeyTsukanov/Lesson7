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

    @Override
    public String toString() {
        return "Барабан " +
                "Размер = " + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return Double.compare(drum.size, size) == 0;
    }
}
