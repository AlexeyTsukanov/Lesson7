package com.company.lesson12.task2;

public class ModsPerent {
    private static int privateA = 7;
    static int defA = 7;
    protected static int protA = 7;
    public static int pubA = 7;

    public static void doSth() {
        int a = privateA;
        a = defA;
        a = protA;
        a = pubA;
    }

}
