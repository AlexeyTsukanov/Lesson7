package com.company.lesson23.task4;

public class Philosof extends Thread {
    private Fork forkLeft;
    private Fork forkRight;

    public Philosof(Fork forkLeft, Fork forkRight) {
        this.forkLeft = forkLeft;
        this.forkRight = forkRight;
    }

    @Override
    public void run() {
        while (true) {
            if (forkRight.isFree()) {
                if (forkLeft.isFree()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " put up forks");
                        forkLeft.setFree(false);
                        forkRight.setFree(false);
                        System.out.println(Thread.currentThread().getName() + " eating");
                        sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " put down forks");
                        forkRight.setFree(true);
                        forkRight.setFree(true);
                        forkLeft.notify();
                        forkRight.notify();
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    System.out.println(Thread.currentThread().getName() + " thinking");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
