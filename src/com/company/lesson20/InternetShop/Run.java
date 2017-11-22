package com.company.lesson20.InternetShop;

import com.company.lesson20.task2.WrongLoginException;
import com.company.lesson20.task2.WrongPasswordException;

import java.util.*;

public class Run {
    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        while (true){
            Scanner scanner = new Scanner(System.in);
            ShopBody.makeDecision(scanner);
            System.out.println("Остаться в магазине? Y/N?");
            String s = scanner.next();
            if (s.equals("N")){
                break;
            }
        }
    }
}
