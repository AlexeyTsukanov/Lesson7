package com.company.lesson23.task4;

public class Fork {
    private boolean isFree = true;

    public Fork(){}

    public synchronized boolean isFree() {
        return isFree;
    }

    public synchronized void setFree(boolean free) {
        isFree = free;
    }
}
