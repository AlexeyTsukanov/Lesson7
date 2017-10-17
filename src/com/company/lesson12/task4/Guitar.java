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
}
