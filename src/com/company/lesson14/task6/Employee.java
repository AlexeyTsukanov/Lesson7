package com.company.lesson14.task6;

import java.util.Date;

public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate = new Date();

    public Employee(String fullName, double salary){
        this.fullName = fullName;
        this.salary = salary;
        salaryDate.getTime();
    }

    public Employee(){}

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return fullName != null ? fullName.equals(employee.fullName) : employee.fullName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullName != null ? fullName.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
