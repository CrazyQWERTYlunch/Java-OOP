package Homework1;

public class Fish extends Animal{
    public Fish(String name, String colour) {
        super(name,colour, 0);
    }
    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak(){
        System.out.println("bul bul bul");
    }
    @Override
    protected void fly(){
        System.out.print("Рыба виляет хвостом и возмущается: ");
        speak();
    }

    @Override
    public void toGo(){
        fly();
    }


}
