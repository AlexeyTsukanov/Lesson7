package com.company.lesson4;

public class ChetNechet {

    public void foundNumber(String[] args) {
        int numb;
        for (int i = 0; i < args.length; i++) {
            numb = Integer.parseInt(args[i]);
            if (numb % 2 > 0) {
                System.out.println(numb);
            }
        }
    }
}
