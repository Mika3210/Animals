package com.company;

public class Main {

    public static void main(String[] args) {

        Animals animal = new Animals("reptiles", 10.0, 2);
        SmallDog dog = new SmallDog("Dachshund", 1.2, 2);
        Raccoon smallRaccoon = new Raccoon ("black", 0.7, 3, "Mila");
        animal.eat();
        animal.sleep();
        dog.eat();
        smallRaccoon.eat();
        smallRaccoon.sleep();
    }
}
