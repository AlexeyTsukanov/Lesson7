package com.company.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        patternTest("Versions: Java  5, Java 6, Java   7, Java 8.");
    }

    public static void patternTest(String patternText){
        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher matcher = pattern.matcher(patternText);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
