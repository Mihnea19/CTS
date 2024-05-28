
public class ConcretePrototypeB implements Prototype {
    String generationTimeConsumingData;
    public ConcretePrototypeB() throws InterruptedException {
        System.out.println("B:  Data generation started ...");
        Thread.sleep(10000);
        System.out.println("B:  Data generation finished.");
        this.generationTimeConsumingData = "GENERATED DATA";
    }
    public ConcretePrototypeB(String generationTimeConsumingData)
    {
        // !!!! deep copy
        this.generationTimeConsumingData = generationTimeConsumingData;
    }

    public Prototype clone() {
        return new ConcretePrototypeB(this.generationTimeConsumingData);
    }
}
