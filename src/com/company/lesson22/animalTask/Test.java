package com.company.lesson22.animalTask;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        Horse horse = new Horse();
        trySerializable(horse);
        System.out.println(tryDeserializable());
    }

    private static Horse tryDeserializable() {
        Horse horse = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("testSer.ser"))) {
            horse = (Horse) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return horse;
    }

    private static void trySerializable(Horse horse) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("testSer.ser"))) {
            outputStream.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
