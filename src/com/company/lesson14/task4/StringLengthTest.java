package com.company.lesson14.task4;

public class StringLengthTest {
    public static void main(String[] args) {
        midle("papa");
        midle("abcdefghij");
    }

    public static void midle(String s) {
        s = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        System.out.println(s);
    }
}
