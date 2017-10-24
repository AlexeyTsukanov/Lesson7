package com.company.lesson13.task3;

public class Atelier {
    public static void clothAMan(Cloth[] cloths) {
        for (int i = 0; i < cloths.length; i++) {
            if (cloths[i] instanceof MenClothing) {
                MenClothing cloth = (MenClothing) cloths[i];
                cloth.clothAMan();
            }
        }
    }

    public static void clothAWoman(Cloth[] cloths) {
        for (int i = 0; i < cloths.length; i++) {
            if (cloths[i] instanceof WomenClothing) {
                WomenClothing cloth = (WomenClothing) cloths[i];
                cloth.clothAWoman();
            }
        }
    }
}
