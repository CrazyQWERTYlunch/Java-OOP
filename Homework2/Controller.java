package Homework2;

import Homework2.impl.*;
import Homework2.parent.Human;
import Homework2.parent.VetClinic;

public class Controller {
    public static void initAnimals() {

        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик", "Рыжий" ))
                .addAnimal(new Dog("Бобик", "Коричневый"))
                .addAnimal(new Duck("Кряк", "Мандариновый"))
                .addAnimal(new Eagle("Беркут", "Коричневый"))
                .addAnimal(new Fish("Немо", "Клоун"));
        showAnimals(vetClinic);
    }

    private static void showAnimals(VetClinic animals){
        System.out.println(animals.getFlyable());
        System.out.println(animals.getSpeakable());
        System.out.println(animals.getSwimable());
        System.out.println(animals.getRunnable());
        System.out.println(animals.getAnimals());
        showDoctor();
    }

    private static void showDoctor() {
        Human doctor = new Doctor("Арсений", 26, "Ветеринар");
        System.out.println(doctor);

    }
}
