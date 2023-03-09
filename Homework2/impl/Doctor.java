package Homework2.impl;

import Homework2.Speakable;
import Homework2.parent.Human;
import Homework2.Illable;
import Homework2.Runnable;
import Homework2.Swimable;

public class Doctor extends Human implements Illable, Runnable, Swimable, Speakable {
    public Doctor(String name, String post, int age) {
        super(name, post, age);
    }
    public Doctor(String name, int age) {
        super(name, null, age);
    }

    public Doctor(String name) {
        super(name, null, 22 );
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
