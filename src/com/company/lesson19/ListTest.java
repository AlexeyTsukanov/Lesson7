package com.company.lesson19;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Box> array = new LinkedList<>();
        array.add(new Box(100));
        array.add(new Box(300));
        array.add(new Box(400));

        System.out.println(checkList(array));
    }

    private static List checkList(List<Box> array) {
        Iterator<Box> iterator = array.iterator();
        List<Box> newArray = new LinkedList<>();
        while (iterator.hasNext()){
            Box box = iterator.next();
            if (box.getWeight() > 300){
                newArray.add(box);
                iterator.remove();
            }
        }
        return newArray;
    }
}
