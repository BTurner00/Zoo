package com.theironyard;

public class Main {

    public static void main(String[] args) {
        Animal d = createAnimal("Dog");
        Animal s = createAnimal ("Snake");
        Animal h = createAnimal("Hawk");
        //Animal a = new Animal();

        d.makeSound();
        s.makeSound();
        h.makeSound();
        //a.makeSound();

        System.out.println(d);
        System.out.println(s);
        System.out.println(h);

    }

    public static Animal createAnimal (String name) {
        switch (name) {
            case "Dog":
                return new Dog();
            case "Snake":
                return new Snake();
            case "Hawk":
                return new Hawk();
        }
        return new Animal();
    }
}
