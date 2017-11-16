package com.company.lesson19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> array = new HashSet<>();
        System.out.println("Введите число");
        while (scanner.hasNextInt()){
            System.out.println("Введите число");
            array.add(scanner.nextInt());
        }
        System.out.println("Вы ввели : " + array);
    }
}
