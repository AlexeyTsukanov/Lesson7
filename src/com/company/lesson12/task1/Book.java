package com.company.lesson12.task1;

public class Book implements Printable {
    private String name;

    public Book(String name){
        this.name = name;
    }

    public Book(){}
    public void print(){
        System.out.println("Книга " + name);
    }

    public static void printBook(Printable[] printables){
        for (Printable printable : printables){
            if (printable instanceof Book){
                System.out.println(printable);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
