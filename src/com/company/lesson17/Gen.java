package com.company.lesson17;

import com.company.lesson11.task4.Animal;

import java.io.Serializable;

public class Gen<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    T ob1;
    V ob2;
    K ob3;

    public Gen(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void showTipe() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
        System.out.println("Type of K is " + ob3.getClass().getName());
    }
}
