package com.company.lesson13.task3;

public class Atelier {
    public static void clothAMan(Cloth[] cloths){
        for (int i = 0; i < cloths.length; i++){
            if (cloths[i] instanceof TShort){
                TShort tShort =(TShort) cloths[i];
                tShort.clothAMan();
            }
            else if (cloths[i] instanceof Pans){
                Pans pans = (Pans) cloths[i];
                pans.clothAMan();
            }
            if (cloths[i] instanceof Tie){
                Tie tie = (Tie) cloths[i];
                tie.clothAMan();
            }
        }
    }
    public static void clothAWoman(Cloth[] cloths){
        for (int i = 0; i < cloths.length; i++){
            if (cloths[i] instanceof TShort){
                TShort tShort =(TShort) cloths[i];
                tShort.clothAWoman();
            }
            else if (cloths[i] instanceof Pans){
                Pans pans = (Pans) cloths[i];
                pans.clothAWoman();
            }
            if (cloths[i] instanceof Skirt){
                Skirt skirt = (Skirt) cloths[i];
                skirt.clothAWoman();
            }
        }
    }
}
