package com.company.lesson19;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Box> array = new ArrayDeque<>();
        array.offer(new Box("Box1"));
        array.offer(new Box("Box2"));
        array.offer(new Box("Box3"));

        System.out.println(array);

        array.poll();

        System.out.println(array);
    }
}
