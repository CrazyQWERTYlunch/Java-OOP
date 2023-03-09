package Homework2.impl;

import Homework2.Speakable;
import Homework2.parent.Human;
import Homework2.Illable;
import Homework2.Runnable;
import Homework2.Swimable;

public class Doctor extends Human implements Illable, Runnable, Swimable, Speakable {
    public Doctor(String name, int age, String post) {
        super(name, age, post);
    }
    public Doctor(String name, int age) {
        super(name, age,null);
    }

    public Doctor(String name) {
        super(name, 22,null );
    }


    @Override
    public void speak() {
        System.out.println("Здравствуйте, добро пожаловать, проходите!");
    }

    @Override
    public void getIll() {
        System.out.println("Доктор сегодня не принимает");
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }
}
