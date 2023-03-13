package Homework3.drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;

    @Override
    public int compareTo(Drug o) {
        int  power = getDrugPower();
        if (Integer.compare(power, o.getDrugPower()) == 0){
            String name = getDrugName();
            return name.compareTo(o.getDrugName());
        }
        return Integer.compare(power, o.getDrugPower());
    }

    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }


    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() { // Проверяет есть ли следующий элемент
                return index < components.size();
            }
            @Override
            public Component next() {
                return components.get(index++);}
        };
    }


    public int getDrugPower(){
        int power = 0;
        for (Component component: components){
            power += component.getPower();
        }
        return power;
    }

    public String getDrugName(){
        String name = "";
        for (Component component: components){
            name += component.getName();
        }
        return name;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n",this.getClass().getSimpleName(),components,getDrugPower());
    }


}


