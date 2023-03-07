package Homework1;

public class Animal {
    private String name;
    private String colour;
    private int pawsCount;


    public Animal(String name, String colour, int pawsCount) {
        this.name = name;
        this.colour = colour;
        this.pawsCount = pawsCount;
    }

    public Animal(String name){
        this(name,null,0);
    }
    Animal(){
        this(null);
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    protected void hunt() {
        wakeUp();
        findFood();
        eat();
    }
    private void wakeUp(){
        System.out.println("Wake up...");
    }

    private void findFood(){
        System.out.println("Found food...");
    }

    private void eat() {
        System.out.println("Eats...");
    }
    public void toPlay(){
        System.out.println("Played...");
    }

    public void goToSleep(){
        System.out.println("Already sleep...");
    }
    public void speak(){
        System.out.println("Yarr...");
    }

    protected void fly(){
        System.out.println("Flying");
    }
    protected void toGo(){
        System.out.println("Goes");
    }
    public void swim(){
        System.out.println("Swims");
    }


    @Override
    public String toString() {
        return String.format("Имя: %s Цвет: %s",this.name,this.colour);
    }
}
