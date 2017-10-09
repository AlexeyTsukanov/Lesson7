package com.company.lesson9;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.circleLong(circle);
        System.out.println(circle.circleLong);
        circle.circleArea(circle);
        System.out.println(circle.circleArea);
    }
}
