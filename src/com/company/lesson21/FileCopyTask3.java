package com.company.lesson21;

import java.io.*;

public class FileCopyTask3 {
    public static void main(String[] args) {
        char[] c = new char[50];
        try (FileReader fileReader = new FileReader("src/com/company/lesson21/file.txt");
             FileWriter fileWriter = new FileWriter("src/com/company/lesson21/copyFile.txt")) {
            fileReader.read(c);
            fileWriter.write(c);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src/com/company/lesson21/file.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/lesson21/fileBufferCopy.txt"))) {
            String s;
            while ((s = reader.readLine()) != null){
                writer.write(s);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
