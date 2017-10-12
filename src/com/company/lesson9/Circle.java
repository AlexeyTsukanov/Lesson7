package com.company.lesson9;

public class Circle {
    private int radius;
    private static double PI = 4.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double circleLong() {
        return (radius * 2) * PI;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return (radius * radius) * PI;
    }

}
