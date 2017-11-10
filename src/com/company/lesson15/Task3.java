package com.company.lesson15;

import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        minWard("sjad3 sjdaouasd8992 133332 1234 ksdjuii3");
    }

    public static void minWard(String someString){
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(someString);
        int lang = 0;
        String stringToPrint = null;
        while (matcher.find()){
            String timeString1 = matcher.group();
            if (lang == 0 || lang > countDifferentSymbolsInWord(timeString1)){
                lang = countDifferentSymbolsInWord(timeString1);
                stringToPrint = timeString1;
            }
        }
        System.out.println(stringToPrint);
    }
    public static int countDifferentSymbolsInWord(String word) {
        char[] wordChars = word.toCharArray();
        int result = 0;
        LinkedHashSet<Character> temp = new LinkedHashSet<Character>();
        for (int i = 0; i < wordChars.length; i++) {
           if (temp.add(wordChars[i])){
               result++;
            }
        }
        return result;
    }
}
