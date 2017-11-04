package com.company.lesson15;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Task2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        print("", "");
        print("UK", "en");
    }

    private static void print(String language, String  country) throws UnsupportedEncodingException {
        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        for (String key : rb.keySet()){
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
