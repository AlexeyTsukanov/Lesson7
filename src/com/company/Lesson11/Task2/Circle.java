package com.company.Lesson11.Task2;

public class Circle extends Shape {
    private int coordinateX;
    private int coordinateY;

    public Circle(int coordinateX, int coordinateY, String color) {
        super(color);
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Circle(String color) {
        super(color);
    }

    public boolean equals(Circle shape){
        if (shape.coordinateX == coordinateX && shape.coordinateY == coordinateY && shape.getColor() == this.getColor()) return true;
        else return false;
    }

    public void drow() {
        System.out.println("Рисую круг с координатами Х: " + coordinateX + ", У = " + coordinateY);
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
