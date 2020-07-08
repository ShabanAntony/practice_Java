package myPackage;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    String name;
    String color;

    public int var;

    public void walk(String place) {
        System.out.println("We are wolking here: " + place);

    }

    public void sleep(){
        System.out.println("Zzzz");
    }

    public void sound(){
        System.out.println("Hello!");
    }
}
