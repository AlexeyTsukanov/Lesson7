package com.company.lesson14.task6;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void generateFullReport(String language, String country, Employee... employees) throws UnsupportedEncodingException {
        getLocaleTopic(language, country);
        for (Employee employee : employees){
            NumberFormat nf = NumberFormat.getInstance();
            DateFormat df = DateFormat.getInstance();
            System.out.println(employee.getFullName() + ", получает зарплату " +
                    nf.format(employee.getSalary()) + " время и дата: " + df.format(employee.getSalaryDate()));
        }
    }

    private static void getLocaleTopic(String language, String  country) throws UnsupportedEncodingException {
        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("employee", locale);
        for (String key : rb.keySet()){
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
    }
}
