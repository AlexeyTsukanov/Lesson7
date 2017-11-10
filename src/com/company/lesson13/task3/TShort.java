package com.company.lesson13.task3;

public class TShort extends Cloth implements MenClothing, WomenClothing {
    public TShort(String size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void clothAMan() {
        System.out.println("Одеваю футболку на мужчину");
        System.out.println(Size.valueOf(getSizeName()).getDescription());
        System.out.println(this);
    }

    @Override
    public void clothAWoman() {
        System.out.println("Одеваю футболку на женщину");
        System.out.println(Size.valueOf(getSizeName()).getDescription());
        System.out.println(this);
    }
}
