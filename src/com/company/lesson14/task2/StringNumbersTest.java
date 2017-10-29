package com.company.lesson14.task2;

public class StringNumbersTest {
    public static void main(String[] args) {
        int a = 3, b = 56;
        StringBuilder sb1 = new StringBuilder(20);
        StringBuilder sb2 = new StringBuilder(20);
        StringBuilder sb3 = new StringBuilder(20);

        System.out.println(sb1.append(a).append("+").append(b).append("=").append(a + b));
        System.out.println(sb2.append(a).append("-").append(b).append("=").append(a - b));
        System.out.println(sb3.append(a).append("*").append(b).append("=").append(a * b));

        System.out.println(sb1.replace(4,5,"равно"));
        System.out.println(sb2.replace(4,5,"равно"));
        System.out.println(sb3.replace(4,5,"равно"));

        /*System.out.println(sb1.deleteCharAt(4).insert(4,"равно"));
        System.out.println(sb2.deleteCharAt(4).insert(4,"равно"));
        System.out.println(sb3.deleteCharAt(4).insert(4,"равно"));*/
    }
}
