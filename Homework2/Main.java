package Homework2;

import Homework1.Animal;
import Homework2.impl.*;
import Homework2.parent.Human;
import Homework2.parent.VetClinic;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        initAnimals();
    }

    private static void initAnimals() {

        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик", "Рыжий" ))
                .addAnimal(new Dog("Бобик", "Коричневый"))
                .addAnimal(new Duck("Кряк", "Мандариновый"))
                .addAnimal(new Eagle("Беркут", "Коричневый"))
                .addAnimal(new Fish("Немо", "Клоун"));
        System.out.println(vetClinic.getFlyable());
        System.out.println(vetClinic.getSpeakable());
        System.out.println(vetClinic.getSwimable());
        System.out.println(vetClinic.getRunnable());
        System.out.println(vetClinic.getAnimals());

    }
}
