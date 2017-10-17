package com.company.lesson11.task5;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Apple(3.4, 12.6);
        fruits[1] = new Apricot(4.1, 15.8);
        fruits[2] = new Pear(2.4, 18.1);

        double allCost = 0;

        for (Fruit fruit : fruits) {
            allCost += fruit.cost();
        }

        System.out.println("Общая стоимость проданых фруктов: " + allCost);
        System.out.println("Яблок продано " + fruits[0].cost());
        System.out.println("Груш продано " + fruits[1].cost());
        System.out.println("Абрикос продано " + fruits[2].cost());
    }
}
