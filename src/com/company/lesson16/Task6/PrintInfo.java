package com.company.lesson16.Task6;

import java.util.Arrays;

public class PrintInfo {
    public static void printClassInfo(Class c) {
        System.out.println("Является ли массивом " + c.isArray());
        System.out.println("Является ли интерфейсом " + c.isInterface());
        System.out.println("Является ли примитивным типом " + c.isPrimitive());
        System.out.println("Вложенные классы: " + Arrays.toString(c.getDeclaredClasses()));
        System.out.println("Конструкторы: " + Arrays.toString(c.getDeclaredConstructors()));
        System.out.println("Методы: " + Arrays.toString(c.getDeclaredMethods()));
        System.out.println("Поля: " + Arrays.toString(c.getDeclaredFields()));
        System.out.println("Суперкласс данного ктасса: " + c.getSuperclass());
        System.out.println("Пакет: " + c.getPackage());
        System.out.println("Модификаторы: " + c.getModifiers());

    }
}
