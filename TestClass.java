package myPackage;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class TestClass {
    public static void main (String[] args){

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vasya";
        dog.name = "Barsik";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("milk");
        dog.sit();

        System.out.println("Cat name is: " + cat.name);
        System.out.println("Dog name is: " + dog.name);

        dog.setWeight(20);
        System.out.println("Dog weight is: " + dog.getWeight());

        dog.sound();
        cat.sound();

    }
}