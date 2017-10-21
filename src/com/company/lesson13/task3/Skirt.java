package com.company.lesson13.task3;

public class Skirt extends Cloth implements WomenClothing {

    String size;

    public Skirt(String  size, double cost, String colore) {
        super(Size.valueOf(size).getEuroSize(), cost, colore);
        this.size = size;
    }


    @Override
    public void clothAWoman() {
        System.out.println("Одеваю юбку на женщину");
        System.out.println(Size.valueOf(size).getDescription());
        System.out.println("Размер " + Size.valueOf(size).getEuroSize());
        System.out.println(this);
    }
}
