package com.company.lesson11.task2;

public class Rectangle extends Shape {
    private int coordinateX;
    private int coordinateY;

    public Rectangle(int coordinateX, int coordinateY, String color) {
        super(color);
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Rectangle(String color) {
        super(color);
    }

    public boolean equals(Rectangle shape){
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
