package com.company.lesson19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> array = new HashSet<>();
        String str = scanner.next();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            array.add(Integer.parseInt(matcher.group()));
        }
        System.out.println(array);
    }
}
