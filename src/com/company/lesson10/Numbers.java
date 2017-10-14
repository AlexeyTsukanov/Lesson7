package com.company.lesson10;

public class Numbers {
    private int a;
    private int b;

    public Numbers(int A, int B) {
        this.a = a;
        this.b = b;
    }

    public Numbers(){}

    public void print() {
        System.out.println(a);
        if (a < b) {
                a++;
                print();
        }
        if (a > b) {
                a--;
                print();
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
