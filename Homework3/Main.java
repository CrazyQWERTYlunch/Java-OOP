package Homework3;

import Homework3.drugs.impl.components.Azitron;

import static Homework3.Controller.initComponent;

public class Main {
    public static void main(String[] args) {

        initComponent(new Azitron("Азитрон", "2", 4),new Azitron("Азитрон", "2", 4));

    }



}
