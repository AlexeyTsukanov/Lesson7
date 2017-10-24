package com.company.lesson13.task2;

public class ShellTest {
    public static void main(String[] args) {
        Double d = Double.valueOf("15.6");
        Double d2 = Double.valueOf(14.5);

        String s = "17.5";
        Double d1 = Double.parseDouble(s);
        byte b = d1.byteValue();
        short s1 = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();

        System.out.println(d2);

        String d3 = Double.toString(3.14);

        String s2 = Double.toString(d);
        String s3 = Byte.toString(b);
        String s4 = Short.toString(s1);
        String s5 = Integer.toString(i);
        String s6 = Long.toString(l);
        String s7 = Float.toString(f);


    }
}
