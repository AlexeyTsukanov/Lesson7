package com.company.lesson22;

import java.io.*;

public class FileInputOutputTest {
    public static void main(String args[]) {
        try(OutputStream output = new FileOutputStream("src/io/a.txt");InputStream input = new FileInputStream("src/io/a.txt")) {
            char c[] = {'a', 'b', 'c'};
            for (char c1 : c) {
                output.write(c1);
            }
            int size = input.available();

            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
