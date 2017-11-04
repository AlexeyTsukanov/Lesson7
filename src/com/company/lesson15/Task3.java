package com.company.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        minWerd("sjad3 sjdaouasd8992 112 ksdjuii3");
    }

    public static void minWerd(String someString){
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(someString);
        int lang = 0;
        String stringToPrint = null;
        while (matcher.find()){
            String timeString1 = matcher.group();
            if (lang == 0 || lang > timeString1.length()){
                lang = timeString1.length();
                stringToPrint = timeString1;
            }
        }
        System.out.println(stringToPrint);
    }
}
