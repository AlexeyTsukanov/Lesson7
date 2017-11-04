package com.company.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        foundString("7 123 qwe d12 qw");
    }

    private static void foundString(String str){
        String s = " " + str + " ";
        Pattern pattern = Pattern.compile("\\s+[a-z]+\\s+");
        Matcher matcher = pattern.matcher(s);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        System.out.println("Колличество слов " + i);
    }
}
