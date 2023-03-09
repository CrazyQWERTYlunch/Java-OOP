package Homework2.impl;

import Homework2.Runnable;
import Homework2.Speakable;
import Homework2.parent.Animal;
import Homework2.Illable;

import java.io.Serializable;

public class Cat extends Animal implements Illable, Runnable, Speakable,Serializable {
    public Cat(String name, String colour) {
        super(name, colour, 4);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }
}

