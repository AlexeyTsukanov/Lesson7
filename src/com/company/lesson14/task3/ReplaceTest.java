package com.company.lesson14.task3;

public class ReplaceTest {
    public static void main(String[] args) {
        replaceString("Object oriented programming");
    }

    public static void replaceString(String s) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(s);
        for (int i = 1; i < 3; i++) {
            sb.delete(i, sb.indexOf(" ") + 1);
            System.out.println(sb);
        }
        sb.delete(3, sb.length());
        System.out.println(sb);
        String end = sb.toString().toUpperCase();
        System.out.println(end);
    }
}
