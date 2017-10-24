package com.company.lesson12.task4;

public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public Guitar(){}

    @Override
    public void play() {
        System.out.println("Играет инструмент гитара с количеством  струн " + numberOfStrings);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String toString() {
        return "Гитара " +
                "Колличество струн = " + numberOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return numberOfStrings == guitar.numberOfStrings;
    }
}
