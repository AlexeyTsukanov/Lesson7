package com.company.lesson23.task4;

public class ActionAtTheTable {
    public static void main(String[] args) {
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();

        Philosof philosof0 = new Philosof(fork1,fork2);
        Philosof philosof1 = new Philosof(fork2,fork3);
        Philosof philosof2 = new Philosof(fork3,fork4);
        Philosof philosof3 = new Philosof(fork4,fork5);
        Philosof philosof4 = new Philosof(fork5,fork1);


        philosof0.start();
        philosof1.start();
        philosof2.start();
        philosof3.start();
        philosof4.start();
    }
}
