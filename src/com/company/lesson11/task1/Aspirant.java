package com.company.lesson11.task1;

public class Aspirant extends Student {
    private String work;

    public Aspirant(String fullName, String group, String work) {
        super(fullName, group);
        this.work = work;
    }

    public Aspirant() {
        super();
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public int getScholarship() {
        return 150;
    }
}
