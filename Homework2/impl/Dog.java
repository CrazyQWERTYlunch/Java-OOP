package Homework2.impl;

import Homework2.Speakable;
import Homework2.parent.Animal;
import Homework2.Illable;
import Homework2.Runnable;
import Homework2.Swimable;

public class Dog extends Animal implements Illable, Runnable, Swimable, Speakable {

    public Dog(String name, String colour) {
        super(name,colour, 4);
    }
    public Dog(String name) {
        this(name,null);
    }


    @Override
    public void speak(){
        System.out.println("Woof");
    }


    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }


    @Override
    public int getRunSpeed(){
        return 20;
    }
}
