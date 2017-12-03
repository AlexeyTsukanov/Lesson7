package com.company.lesson23.task3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> n;
    boolean valueSet = false;

    public MyQueue() {
        this.n = new LinkedList<>();
    }

    public synchronized T get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + n + ", от " + Thread.currentThread().getName());
        valueSet = false;
        notify();
        return n.remove();
    }

    public synchronized void put(T n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n.add(n);
        System.out.println("Oтпpaвлeнo: " + n + ", к " + Thread.currentThread().getName());
        notify();
    }
}
