package com.company.lesson11.task3;

public abstract class Flower {
    private String name;
    private int term;
    private static int quantity;

    public Flower(int n, String name, int term) {
        quantity += n;
        this.name = name;
        this.term = term;
    }

    public Flower() {
    }

    abstract int colculateOfCoust();

    public static void ollSails() {
        System.out.println("Всего продано цветов " + quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Flower.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (term != flower.term) return false;
        return name != null ? name.equals(flower.name) : flower.name == null;
    }

    @Override
    public String toString() {
        return "Наименование цветка - '" + name + '\'' +
                ", Срок хранения - " + term;
    }
}
