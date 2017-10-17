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
        for (int i = 0; i < printables.length; i++){
            if (printables[i] instanceof Magazines){
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
