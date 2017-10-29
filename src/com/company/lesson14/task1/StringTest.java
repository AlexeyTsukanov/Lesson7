package com.company.lesson14.task1;

public class StringTest {
    public static void main(String[] args) {
        doSomething("I like Java!!!");
    }

    public static void doSomething(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7, 11));
    }
}
