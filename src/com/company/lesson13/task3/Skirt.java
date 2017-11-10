package com.company.lesson13.task3;

public class Skirt extends Cloth implements WomenClothing {
    public Skirt(String size, double cost, String colore) {
        super(size, cost, colore);
    }

    @Override
    public void clothAWoman() {
        System.out.println("Одеваю юбку на женщину");
        System.out.println(Size.valueOf(getSizeName()).getDescription());
        System.out.println(this);
    }
}
