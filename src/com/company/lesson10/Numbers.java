package com.company.lesson10;

public class Numbers {
    private int A;
    private int B;

    Numbers(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public void print() {
        System.out.println(A);
        if (A < B) {
            if (A != B) {
                A++;
                print();
            }
        }
        if (A > B) {
            if (A != B) {
                A--;
                print();
            }
        }
    }
}
