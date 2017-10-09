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
    private int takeBookQuantity;
    private String[] bookTopic;
    private int returnBookQuantity;
    private String[] returnBookTopic;

    Student(String fullName, int ticket, String faculty, String bornDate, String telephone) {
        this.fullName = fullName;
        this.ticket = ticket;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.telephone = telephone;
    }

    public void takeBook() {
        System.out.println("Введите день получения книги.");
        int dd = scn.nextInt();
        System.out.println("Введите месяц получения книги.");
        int mm = scn.nextInt();
        System.out.println("Введите год получения книги.");
        int yy = scn.nextInt();
        date = dd + "." + mm + "." + yy;
    }

    public void takeBook(int takeBookQuantity) {
        this.takeBookQuantity = takeBookQuantity;
    }

    public void takeBook(String... bookTopic) {
        this.bookTopic = bookTopic;
    }

    public void takeBook(Book... book) {
        System.out.println("Количество обьектов: " + book.length);
    }

    public void returnBook() {
        System.out.println("Введите день сдачи книги.");
        int dd = scn.nextInt();
        System.out.println("Введите месяц сдачи книги.");
        int mm = scn.nextInt();
        System.out.println("Введите год сдачи книги.");
        int yy = scn.nextInt();
        dateReturn = dd + "." + mm + "." + yy;
    }

    public void returnBook(int returnBookQuantity) {
        this.returnBookQuantity = returnBookQuantity;
    }

    public void returnBook(String... bookTopic) {
        this.returnBookTopic = bookTopic;
    }

    public void returnBook(Book... book) {
        System.out.println("Количество обьектов: " + book.length);
    }

    public void infoTake() {
        System.out.println(fullName + " получил книгу " + date);
    }

    public void infoReturn() {
        System.out.println(fullName + " вернул книгу " + dateReturn);
    }
}
