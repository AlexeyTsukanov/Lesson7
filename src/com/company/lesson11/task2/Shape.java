package com.company.lesson11.task2;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void drow();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
