package com.company.lesson19;

public class Box {
    private String name;
    private int weight;

    public Box(String name) {
        this.name = name;
    }

    public Box(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
