package Homework3;

import Homework3.drugs.Component;
import Homework3.drugs.impl.CatDrug;
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

    private static void showComponents(List<Component> components, Set<Component> componentsSet) {

        for (Component component : components) {
            System.out.println(component);
        }
        System.out.println("----------------------");

        for (Component component : componentsSet) {
            System.out.println(component);
        }
    }

    public static void compareOfDrugs(){
        List<Component> componentCat1 = List.of(new Pinecilin("Пинецилин", "5", 12)
                , new Azitron("Азитрон", "2", 12));
        List<Component> componentCat2 = List.of(new Water("Вода", "20", 12)
                , new Azitron("Азитрон", "2", 15));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12)
                , new Azitron("Пинецилин", "2", 15));

        CatDrug drug1 = new CatDrug(componentCat1);
        CatDrug drug2 = new CatDrug(componentCat2);
        CatDrug drug3 = new CatDrug(componentCat3);
        System.out.println(drug1);
        System.out.println(drug2);
        System.out.println(drug3);
        System.out.println(drug1.compareTo(drug2));
        System.out.println(drug2.compareTo(drug3));


    }

}
