package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = initAnimals();

        for (Animal a:animals){lifeOfAnimal(a);}

    }

    public static List<Animal> initAnimals() {
        List<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("Барбос", "Чёрный");
        animals.add(dog);

        Cat cat = new Cat("Мурзик","Рыжий");
        animals.add(cat);

        Duck duck = new Duck("Дональд");
        animals.add(duck);

        Fish fish = new Fish("Немо", "Клоун");
        animals.add(fish);

        return animals;
    }

    public static void lifeOfAnimal(Animal  test_subject){

        System.out.printf("%s: %s\n", test_subject.getType(),test_subject.getName());

        test_subject.hunt();
        test_subject.fly();
        test_subject.swim();
        test_subject.toPlay();
        test_subject.speak();
        test_subject.toGo();
        test_subject.goToSleep();

        System.out.println();
    }

}
