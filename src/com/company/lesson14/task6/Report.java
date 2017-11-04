package com.company.lesson14.task6;

public class Report {
    public static void generateReport(Employee... employees){
        for (Employee employee : employees){
            System.out.printf("%-7S, получает зарплату %10.2f\n", employee.getFullName(), employee.getSalary());
        }
    }
}
