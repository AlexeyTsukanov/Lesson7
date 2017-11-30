package com.company.lesson21;

import java.io.File;
import java.util.Scanner;

public class TreeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя директории.");
        String dirname = scanner.next();

        allDirectorsFound(dirname);
    }

    private static void allDirectorsFound(String dirname) {
        File topFile = new File(dirname);
        if (topFile.isDirectory()) {
            System.out.println(("Directory of: ") + dirname);
            String s[] = topFile.list();

            for (String line : s) {
                String nextDirectoryLink = dirname + "/" + line;
                File nextFile = new File(nextDirectoryLink);
                if (nextFile.isDirectory()) {
                    System.out.println("-------------------------");
                    allDirectorsFound(nextDirectoryLink);
                } else {
                    System.out.println(line + " is a file.");
                }
            }
        }
    }
}
