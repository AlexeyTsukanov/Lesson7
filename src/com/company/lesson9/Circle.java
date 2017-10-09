package com.company.lesson9;

public class Circle {
    public int radius;
    public static double PI = 4.14;
    public double circleLong;
    public double circleArea;


    Circle(int radius) {
        this.radius = radius;
    }

    Circle circleLong(Circle circle) {
        circle.circleLong = (circle.radius * 2) * PI;
        return circle;
    }

    Circle circleArea(Circle circle) {
        circle.circleArea = (circle.radius * circle.radius) * PI;
        return circle;
    }

}
