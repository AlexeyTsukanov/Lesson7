package com.company.lesson12.task1;

public class Magazines implements Printable {
    private String name;

    public Magazines(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("Книга " + name);
    }

    public static void printMagazines(Printable[] printables){
        for (Printable printable : printables){
            if (printable instanceof Magazines){
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
