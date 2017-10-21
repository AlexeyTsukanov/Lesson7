package com.company.lesson13.task3;

public enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 38),
    M("Взрослый размер", 40),
    L("Взрослый размер", 44);

    private String description;
    private int euroSize;

    Size(String description, int euroSize){
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize(){
        return euroSize;
    }
}
