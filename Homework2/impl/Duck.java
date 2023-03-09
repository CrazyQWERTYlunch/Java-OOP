package Homework2.impl;

import Homework2.Speakable;
import Homework2.parent.Animal;
import Homework2.Flyable;
import Homework2.Illable;
import Homework2.Swimable;

public class Duck extends Animal implements Illable, Flyable, Swimable, Speakable {
    public Duck(String name, String colour) {
        super(name,colour, 2);
    }
    public Duck(String name) {
        this(name,null);
    }
    @Override
    public void speak(){
        System.out.println("Quack");
    }



    @Override
    public int getFlightSpeed() {
        return 25;
    }



    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
