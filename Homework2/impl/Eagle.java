package Homework2.impl;

import Homework2.Speakable;
import Homework2.parent.Animal;
import Homework2.Flyable;
import Homework2.Illable;

public class Eagle extends Animal implements Flyable, Illable, Speakable {

    public Eagle(String name, String colour) {
        super(name,colour, 2);
    }
    public Eagle(String name) {
        this(name,null);
    }
    @Override
    public void speak() {

    }


    @Override
    public int getFlightSpeed() {
        return 150;
    }

    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }
}
