package Homework1;

public class Dog extends Animal{

    public Dog(String name, String colour) {
        super(name,colour, 4);
    }
    public Dog(String name) {
        this(name,null);
    }


    public void dontFlyButJump(){
        System.out.println("Высоко подпрыгнул");
    }

    @Override
    public void speak(){
        System.out.println("Woof");
    }
    @Override
    protected void fly(){
        dontFlyButJump();
    }

}
