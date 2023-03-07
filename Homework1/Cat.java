package Homework1;

public class Cat extends Dog {
    public Cat(String name, String colour) {
        super(name,colour);
    }
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public void swim(){
        System.out.println("Подошёл к воде, окунул лапу в воду, поёжился, ударил лапой воду, ушёл");
    }
}
