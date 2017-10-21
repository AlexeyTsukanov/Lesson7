package com.company.lesson13.task3;

public class TShort extends Cloth implements MenClothing, WomenClothing {
    String size;

    public TShort(String size, double cost, String colore) {
        super(Size.valueOf(size).getEuroSize(), cost, colore);
        this.size = size;
    }

    @Override
    public void clothAMan() {
        System.out.println("Одеваю футболку на мужчину");
        System.out.println(Size.valueOf(size).getDescription());
        System.out.println("Размер " + Size.valueOf(size).getEuroSize());
        System.out.println(this);
    }

    @Override
    public void clothAWoman() {
        System.out.println("Одеваю футболку на женщину");
        System.out.println(Size.valueOf(size).getDescription());
        System.out.println("Размер " + Size.valueOf(size).getEuroSize());
        System.out.println(this);
    }
}
