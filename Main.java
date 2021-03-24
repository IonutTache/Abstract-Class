package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("papagal");///////////nu mai merge initializata ptr ca am extins Parrot din Bird.
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Australian parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
        parrot.breathe();

    }
}
