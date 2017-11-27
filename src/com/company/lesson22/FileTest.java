package com.company.lesson22;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("src/com/company/lesson22/test.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/lesson22/test1.txt"))) {
            String s;
            while ((s = reader.readLine()) != null){
                writer.write(s);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
