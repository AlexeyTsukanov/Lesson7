package com.company.lesson23.task3;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> n;

    public MyQueue() {
        this.n = new LinkedList<>();
    }

    public synchronized T get() {
        while (n.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + n.element() + ", от " + Thread.currentThread().getName());
        notifyAll();
        return n.remove();
    }

    public synchronized void put(T n) {
        while (!this.n.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n.add(n);
        System.out.println("Oтпpaвлeнo: " + n + ", к " + Thread.currentThread().getName());
        notifyAll();
    }
}
