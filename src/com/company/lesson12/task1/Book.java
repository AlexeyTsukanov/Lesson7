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
        for (int i = 0; i < printables.length; i++){
            if (printables[i] instanceof Book){
                System.out.println(printables[i].toString());
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
