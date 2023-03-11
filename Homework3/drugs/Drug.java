package Homework3.drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    private List<Component> components;

    @Override// Дикая штука сравнения классов
    public int compareTo(Drug o) {
        int power = getDrugPower();
        return Integer.compare(power, o.getDrugPower());
    }

    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }


    @Override // Эта херня - анонимный класс, был переопределён класс iterator, который возвращает новый экз. класса
    // Мы взяли абстрактный класс и сделали его экземпляр без названия типо AbsCl <>
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override // В интерфейсе итератора переопределили методы
            public boolean hasNext() { // Проверяет есть ли следующий элемент
                return index < components.size();
            }
            @Override
            public Component next() {
                return components.get(index++); //Получить компонент и увеличить индекс
            }
        };
    }


    public int getDrugPower(){
        int power = 0;
        for (Component component: components){
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n",this.getClass().getSimpleName(),components,getDrugPower());
    }


}


