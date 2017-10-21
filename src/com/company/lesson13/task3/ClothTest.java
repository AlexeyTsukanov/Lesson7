package com.company.lesson13.task3;

public class ClothTest {
    public static void main(String[] args) {
        Cloth[] cloths = new Cloth[4];
        cloths[0] = new TShort("S", 14.5, "blue");
        cloths[1] = new Pans("XS", 16.5, "black");
        cloths[2] = new Skirt("XXS", 20, "white");
        cloths[3] = new Tie("M", 10.1, "green");

        Atelier.clothAMan(cloths);
        Atelier.clothAWoman(cloths);
    }
}
