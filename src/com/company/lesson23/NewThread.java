package com.company.lesson23;

public class NewThread {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();

        Thread myTread1 = new Thread(newRunnable, "Tread1");
        Thread myTread2 = new Thread(newRunnable, "Tread2");
        Thread myTread3 = new Thread(newRunnable, "Tread3");

        myTread1.start();
        myTread2.start();
        myTread3.start();
    }

    public static class NewRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i <= 100; i++) {
                if (i % 10 == 0) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
