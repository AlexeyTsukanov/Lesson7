package com.company.lesson11.task4;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Кошачий корм", "дома");
        Dog dog = new Dog("Собачий корм", "во дворе");
        Horse horse = new Horse("Сено", "Стойло");

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;

        Veterenar veterenar = new Veterenar();

        for (Animal animal : animals){
            veterenar.treatAnimal(animal);
            animal.eat();
            animal.makeNoise();
            animal.sleep();
        }
    }
}
