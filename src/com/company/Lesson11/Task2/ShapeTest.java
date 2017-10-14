package com.company.Lesson11.Task2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle1 = new Circle(10, 10, "blue");
        Circle circle2 = new Circle(10, 10, "blue");
        Shape circle3 = new Circle(10, 10,"white");
        Rectangle rectangle = new Rectangle(30, 30,"green");
        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = rectangle;
        for (Shape shape : shapes) {
            shape.drow();
        }

        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
    }
}
