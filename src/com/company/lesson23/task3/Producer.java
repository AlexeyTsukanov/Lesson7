package com.company.lesson23.task3;

public class Producer implements Runnable {
    int i = 0;
    MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true){
            myQueue.put(i);
            i++;
        }
    }
}
