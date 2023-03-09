package Homework2.parent;

public abstract class Human {

    private String name;
    private String post;
    private int age;



    public static int countHuman = 0;

    public Human(String name,String post, int age){
        this.name = name;
        this.post = post;
        this.age = age;
        countHuman++;
    }

    public Human(String name,int age){
        this(name, null, age);
    }
    public Human(String name){
        this(name, 0);
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }
    public int getAge() {
        return age;
    }

    public static int getCountHuman(){
        return countHuman;
    }
    public abstract void speak();

    @Override
    public String toString() {
        return String.format("Имя: %s Возраст:%d Должность:%s",this.name,this.age,this.post);
    }
}
