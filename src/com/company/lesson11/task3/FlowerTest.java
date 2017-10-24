package com.company.lesson11.task3;

public class FlowerTest {
    public static void main(String[] args) {
        int sum = 0;
        
        Carnations carnations = new Carnations(2);
        Roze roze = new Roze(1);
        Chamomile chamomile = new Chamomile(1);
        Hrizontem hrizontem = new Hrizontem(1);

        Flower[] flowers = new Flower[4];
        flowers[0] = carnations;
        flowers[1] = roze;
        flowers[2] = chamomile;
        flowers[3] = hrizontem;

        for (Flower flower : flowers){
            sum += flower.colculateOfCoust();
        }

        System.out.println(flowers[0]);

        System.out.println(sum);

        Flower.ollSails();
    }
}
