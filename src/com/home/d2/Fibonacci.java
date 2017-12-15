package com.home.d2;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int numb1 = 1;
        int numb2 = 1;
        final int MAX_INDEX = 10;
        Numbers[] numbers = new Numbers[MAX_INDEX];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = new Numbers(numb1);
            numb1 += numb2;
            numb2 = numb1 - numb2;
        }

        System.out.println(Arrays.toString(numbers));
    }

    static class Numbers{
        private String number;

        public Numbers(int number){
            this.number = number + checkNumb(number);
        }

        private String checkNumb(int n){
            if (n % 2 == 0){
                return "*";
            }
            else return "";
        }

        @Override
        public String toString() {
            return number;
        }
    }
}
