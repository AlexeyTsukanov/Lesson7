package com.company.Lesson11.Task4;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("some food", "some Location");
        Dog dog = new Dog("some food2", "some Location2");
        Horse horse = new Horse("some food3", "some Location3");

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;

        Veterenar veterenar = new Veterenar();

        for (Animal animal : animals){
            veterenar.treatAnimal(animal);
        }
    }
}
