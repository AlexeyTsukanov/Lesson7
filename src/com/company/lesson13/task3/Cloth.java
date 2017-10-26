package com.company.lesson13.task3;

abstract class Cloth {
    private Size size;
    private double cost;
    private String colore;
    private String sizeName;

    public Cloth(String sizeName, double cost, String colore) {
        this.colore = colore;
        this.cost = cost;
        this.sizeName = sizeName;
        this.size = Size.valueOf(sizeName);
    }

    public String getSizeName() {
        return sizeName;
    }

    @Override
    public String toString() {
        return "Размер : " + size +
                ", стоимость : " + cost +
                ", цвет : " + colore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cloth cloth = (Cloth) o;

        if (size != cloth.size) return false;
        if (Double.compare(cloth.cost, cost) != 0) return false;
        if (colore != null ? !colore.equals(cloth.colore) : cloth.colore != null) return false;
        return sizeName != null ? sizeName.equals(cloth.sizeName) : cloth.sizeName == null;
    }
}
