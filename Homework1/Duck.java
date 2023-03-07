package Homework1;

public class Duck extends Animal{

    public Duck(String name, String colour) {
        super(name,colour, 2);
    }
    public Duck(String name) {
        this(name,null);
    }

    @Override
    public void speak(){
        System.out.println("Quack");
    }


}
