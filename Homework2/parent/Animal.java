package Homework2.parent;

public abstract class Animal {
    private String name;
    private String colour;
    private int age;
    private static int animalsCount = 0;

    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        animalsCount++;
    }

    public Animal(String name){
        this(name,null,0);
    }
    public Animal(){
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
        this.age = pawsCount;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getPawsCount() {
        return age;
    }
    public static int getAnimalsCount(){
        return animalsCount;
    }

    protected static void lifeOfAnimal(Animal test_subject){
        System.out.printf("%s: %s\n", test_subject.getType(),test_subject.getName());
        test_subject.wakeUp();
        test_subject.findFood();
        test_subject.eat();
        test_subject.toPlay();
        test_subject.goToSleep();
    }

    private void wakeUp() {
        System.out.println(" wake up...");
    }

    private void findFood() {
        System.out.println(" found food...");
    }

    private void eat() {
        System.out.println(" eats...");
    }

    private void toPlay() {
        System.out.println(" played...");
    }

    private void goToSleep() {
        System.out.println(" already sleep...");
    }

    @Override
    public String toString() {
        return String.format("Имя: %s Цвет: %s",this.name,this.colour);
    }
}

