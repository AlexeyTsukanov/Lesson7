package com.company.lesson12.task1;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("book1");
        printables[1] = new Magazines("magazine1");
        printables[2] = new Book("book2");
        printables[3] = new Magazines("magazine2");

        Book.printBook(printables);
        Magazines.printMagazines(printables);
    }
}
