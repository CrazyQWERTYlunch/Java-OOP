package Homework2.impl;

import Homework2.Illable;
import Homework2.Swimable;
import Homework2.parent.Animal;

public class Fish extends Animal implements Illable, Swimable {

    public Fish(String name, String colour) {
        super(name,colour, 4);
    }
    public Fish(String name) {
        this(name,null);
    }

    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }


}
