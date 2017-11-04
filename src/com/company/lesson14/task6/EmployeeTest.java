package com.company.lesson14.task6;

import java.io.UnsupportedEncodingException;

public class EmployeeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Vasya", 12256.25);
        employees[1] = new Employee("Petya", 8893.19);
        employees[2] = new Employee("Styopa", 21983.87);

        Report.generateReport(employees);

        FullReport.generateFullReport("", "", employees);
        FullReport.generateFullReport("UK", "en", employees);
    }
}
