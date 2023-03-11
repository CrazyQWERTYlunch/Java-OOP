package Homework3;

import Homework3.drugs.Component;
import Homework3.drugs.impl.components.Azitron;
import Homework3.drugs.impl.components.Pinecilin;
import Homework3.drugs.impl.components.Water;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {

    public static void initComponent(Component firstComponent, Component secondComponent) {

        List<Component> components = List.of(firstComponent, secondComponent
                , new Azitron("Азитрон", "2", 4)
                , new Pinecilin("Пинецилин", "5", 6)
                , new Water("Вода", "20", 12)
                , new Azitron("Азитрон", "2", 9)
                , new Pinecilin("Пинецилин", "5", 100));

        Set<Component> componentsSet = new HashSet<>(components);

        showComponents(components,componentsSet);

    }

    public static void showComponents(List<Component> components, Set<Component> componentsSet) {

        for (Component component : components) {
            System.out.println(component);
        }
        System.out.println("----------------------");

        for (Component component : componentsSet) {
            System.out.println(component);
        }
    }
}
