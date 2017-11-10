package com.company.lesson16.task6;

import com.company.lesson4.Garland;

public class PrintInfoTest {
    public static void main(String[] args) {
        Garland c = new Garland();
        PrintInfo.printClassInfo(c.getClass());
    }
}
