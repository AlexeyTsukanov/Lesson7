package com.company.lesson22.animalTask;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private transient Halter halter;

    public Horse() {
        halter = new Halter();
    }

    @Override
    public String toString() {
        return "Выполнено.";
    }
}
