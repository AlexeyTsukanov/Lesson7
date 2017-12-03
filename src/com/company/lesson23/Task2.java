package com.company.lesson23;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        MakeRun m1 = new MakeRun(sb);
        MakeRun m2 = new MakeRun(sb);
        MakeRun m3 = new MakeRun(sb);

        m1.start();
        m2.start();
        m3.start();
    }

    public static class MakeRun extends Thread {
        private StringBuilder letter;

        public MakeRun(StringBuilder letter) {
            this.letter = letter;
        }

        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(letter);
            }
            char newLetter = letter.charAt(0);
            newLetter++;
            letter.setCharAt(0, newLetter);
        }
    }
}
