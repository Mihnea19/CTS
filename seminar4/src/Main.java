// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();

        return instance;
    }
    public void doSomething(){
        System.out.println("ceva");
    }
}

class DatabaseConnection{
    private static volatile DatabaseConnection instance;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(instance==null){
            synchronized (DatabaseConnection.class){
                if(instance==null)
                {
                    instance=new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}

interface Animal{
    default void sound(){};
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Ham");
    }
}

class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("mewo");
    }
}

class AnimalFactory{
    public static Animal createAnimal(String type){
        if("Dog".equalsIgnoreCase(type)){
            return new Dog();
        }else if ("Cat".equalsIgnoreCase(type)){
            return new Cat();
        }else{
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

interface Shape{
    default void draw(){};
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Patrat");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Cerc");
    }
}

class ShapeFactory{
    public static Shape createShape(String type){
        if("Patrat".equalsIgnoreCase(type)){
            return new Square();
        }else if ("Cerc".equalsIgnoreCase(type)){
            return new Circle();
        }else{
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton instanta=Singleton.getInstance();
        instanta.doSomething();

        Animal doggo=AnimalFactory.createAnimal("Dog");
        doggo.sound();

        Animal cat=AnimalFactory.createAnimal("Cat");
        cat.sound();

        Animal x=doggo;
        x.sound();
        x=cat;
        cat.sound();

        Shape patrat=ShapeFactory.createShape("Patrat");
        patrat.draw();

        Shape cerc=ShapeFactory.createShape("Cerc");
        cerc.draw();
    }
}