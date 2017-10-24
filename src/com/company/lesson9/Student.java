package com.company.lesson9;

import java.util.Scanner;

public class Student {
    private String fullName;
    private int ticket;
    private String faculty;
    private String bornDate;
    private String telephone;
    private Scanner scn = new Scanner(System.in);
    private String date;
    private String dateReturn;
    private int takeBookQuantity;
    private String[] bookTopic;
    private int returnBookQuantity;
    private String[] returnBookTopic;

    public Student(String fullName, int ticket, String faculty, String bornDate, String telephone) {
        this.fullName = fullName;
        this.ticket = ticket;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.telephone = telephone;
    }

    public Student(){}

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public int getTakeBookQuantity() {
        return takeBookQuantity;
    }

    public void setTakeBookQuantity(int takeBookQuantity) {
        this.takeBookQuantity = takeBookQuantity;
    }

    public String[] getBookTopic() {
        return bookTopic;
    }

    public void setBookTopic(String[] bookTopic) {
        this.bookTopic = bookTopic;
    }

    public int getReturnBookQuantity() {
        return returnBookQuantity;
    }

    public void setReturnBookQuantity(int returnBookQuantity) {
        this.returnBookQuantity = returnBookQuantity;
    }

    public String[] getReturnBookTopic() {
        return returnBookTopic;
    }

    public void setReturnBookTopic(String[] returnBookTopic) {
        this.returnBookTopic = returnBookTopic;
    }
}
