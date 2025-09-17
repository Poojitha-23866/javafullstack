package com.tnsif.day44;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class Hierarchialinheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited from Animal
        d.bark(); // Dog specific

        Cat c = new Cat();
        c.eat();  // inherited from Animal
        c.meow(); // Cat specific
    }
}

