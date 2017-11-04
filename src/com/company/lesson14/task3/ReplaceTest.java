package com.company.lesson14.task3;

public class ReplaceTest {
    public static void main(String[] args) {
        replaceString("Object oriented programming");
        replaceOOP("palsd[pasld a[sdlasd object oriented programming asl;dm;alsd asdas");
    }

    public static void replaceString(String s) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(s);
        for (int i = 1; i < 3; i++) {
            sb.delete(i, sb.indexOf(" ") + 1);
        }
        sb.delete(3, sb.length());
        String end = sb.toString().toUpperCase();
        System.out.println(end);
    }

    public static void replaceOOP(String s){
        StringBuilder sb = new StringBuilder(20);
        sb.append(s);
        sb.replace(sb.indexOf("object oriented programming"),sb.indexOf("object oriented programming")+"object oriented programming".length(),"OOP");
        System.out.println(sb);
    }
}
