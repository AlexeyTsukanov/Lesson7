package com.company.lesson9;

import java.util.Scanner;

public class Student {
    String fullName;
    int ticket;
    String faculty;
    String bornDate;
    String telephone;
    Scanner scn = new Scanner(System.in);
    private String date;
    private String dateReturn;

    Student(String fullName, int ticket, String faculty, String bornDate, String telephone) {
        this.fullName = fullName;
        this.ticket = ticket;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.telephone = telephone;
    }

    void takeBook() {
        System.out.println("Введите день получения книги.");
        int dd = scn.nextInt();
        System.out.println("Введите месяц получения книги.");
        int mm = scn.nextInt();
        System.out.println("Введите год получения книги.");
        int yy = scn.nextInt();
        date = dd + "." + mm + "." + yy;
    }

    void returnBook() {
        System.out.println("Введите день сдачи книги.");
        int dd = scn.nextInt();
        System.out.println("Введите месяц сдачи книги.");
        int mm = scn.nextInt();
        System.out.println("Введите год сдачи книги.");
        int yy = scn.nextInt();
        dateReturn = dd + "." + mm + "." + yy;
    }

    void infoTake() {
        System.out.println(fullName + " получил книгу " + date);
    }

    void infoReturn() {
        System.out.println(fullName + " вернул книгу " + dateReturn);
    }
}
