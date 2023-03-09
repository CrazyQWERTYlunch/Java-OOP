package Homework2.parent;

import Homework2.Flyable;
import Homework2.Speakable;
import Homework2.Swimable;
import Homework2.Runnable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;


    public VetClinic addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }


    public VetClinic () {
        this.animals = new ArrayList<>();}

    public List<Animal> getAnimals() {return animals;}
    public List<Speakable> getSpeakable() {
        List<Speakable> speakables = new ArrayList<>();

        for (Animal animal: getAnimals()) {
            if (animal instanceof Speakable) {
                speakables.add((Speakable) animal);
            }
        } return speakables;
    }

        public List<Flyable> getFlyable() {

        List<Flyable> flyables = new ArrayList<>();
            for (Animal animal : getAnimals()) {
                if (animal instanceof Flyable) {
                    flyables.add((Flyable) animal);
                }
            } return flyables;
        }

        public List<Runnable> getRunnable() {

        List<Runnable> runnables = new ArrayList<>();

            for (Animal animal: getAnimals()) {
                if (animal instanceof Runnable) {
                    runnables.add((Runnable) animal);
                }
            } return runnables;
        }
        public List<Swimable> getSwimable() {

        List<Swimable> swimables = new ArrayList<>();

            for (Animal animal: getAnimals()) {
                if (animal instanceof Swimable) {
                    swimables.add((Swimable) animal);
                }
            } return swimables;
        }


}
