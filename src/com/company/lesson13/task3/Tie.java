package com.company.lesson13.task3;

public class Tie extends Cloth implements MenClothing {

    public Tie(String size, double cost, String colore) {
        super(size, cost, colore);
    }

    @Override
    public void clothAMan() {
        System.out.println("Одеваю галстук на мужчину");
        System.out.println(Size.valueOf(getSizeName()).getDescription());
        System.out.println(this);
    }
}
