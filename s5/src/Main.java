// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface Animal{
    public void sound();
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

interface AnimalFactory{
    Animal createAnimal();
}

class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

//exemplu 1
interface Document{
    public void open();
    public void save();
}

class TextDocument implements Document{

    @Override
    public void open() {
        System.out.println("TextDocument opened");
    }

    @Override
    public void save() {
        System.out.println("TextDocument saved");
    }
}

class ImageDocument implements Document{

    @Override
    public void open() {
        System.out.println("ImageDocument opened");
    }

    @Override
    public void save() {
        System.out.println("ImageDocument saved");
    }
}

interface DocumentFactory{
    Document createDocument();
}

class TextDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

class ImageDocumentFactory implements DocumentFactory{

    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}

//exemplu 2
interface Chair{
    String sitOn();
}

class ModernChair implements Chair{
    @Override
    public String sitOn() {
        return "Sitting on a modern chair.";
    }
}

class VictorianChair implements Chair{
    @Override
    public String sitOn() {
        return "Sitting on a victorian chair.";
    }
}

interface Sofa{
    String lieOn();
}

class ModernSofa implements Sofa{
    @Override
    public String lieOn() {
        return "Lying on a modern sofa.";
    }
}

class VictorianSofa implements Sofa{
    @Override
    public String lieOn() {
        return "Lying on a victorian sofa.";
    }
}

interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class Client{
    private final FurnitureFactory furnitureFactory;


    Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void useFurniture(){
        Chair chair=furnitureFactory.createChair();
        Sofa sofa=furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.lieOn());
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalFactory doggo=new DogFactory();
        Animal dog=doggo.createAnimal();
        dog.sound();

        AnimalFactory cattinho=new CatFactory();
        Animal cat=cattinho.createAnimal();
        cat.sound();


        //exemplu 1
        DocumentFactory texty=new TextDocumentFactory();
        Document text=texty.createDocument();
        text.open();
        text.save();

        DocumentFactory imagy=new ImageDocumentFactory();
        Document image=imagy.createDocument();
        image.open();
        image.save();

        //exemplu 2
        FurnitureFactory modernFactory=new ModernFurnitureFactory();
        FurnitureFactory victorianFactory=new VictorianFurnitureFactory();

        System.out.println("Client uses modern furniture");
        Client client1=new Client(modernFactory);
        client1.useFurniture();

        System.out.println("\nClient uses victorian furniture");
        Client client2=new Client(victorianFactory);
        client2.useFurniture();
    }
}