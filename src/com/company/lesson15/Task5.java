package com.company.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        foundPalindrome("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554");
    }
    private static void foundPalindrome(String str){
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            StringBuilder s = new StringBuilder(matcher.group());
            String a = s.toString();
            String b = s.reverse().toString();
            if (a.equals(b)){
                System.out.println(s);
            }
        }
    }
}
