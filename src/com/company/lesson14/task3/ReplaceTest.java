package com.company.lesson14.task3;

public class ReplaceTest {
    public static void main(String[] args) {
        Replace.replaceOOP("palsd[pasld a[sdlasd object oriented programming asl;dm;alsd asdas");
    }
    public static class Replace {
        final static String OOP = "object oriented programming";

        public static void replaceOOP(String s) {
            StringBuilder sb = new StringBuilder(s);
            sb.replace(sb.indexOf(OOP), sb.indexOf(OOP) + OOP.length(), "OOP");
            System.out.println(sb);
        }
    }
}
