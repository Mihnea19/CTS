
public class ConcretePrototypeA implements Prototype {
    String generationTimeConsumingData;
    public ConcretePrototypeA() throws InterruptedException {
        System.out.println("A:  Data generation started ...");
        Thread.sleep(10000);
        System.out.println("A:  Data generation finished.");
        this.generationTimeConsumingData = "GENERATED DATA";
    }
    public ConcretePrototypeA(String generationTimeConsumingData)
    {
        // !!!! deep copy
        this.generationTimeConsumingData = generationTimeConsumingData;
    }

    public Prototype clone() {
        return new ConcretePrototypeA(this.generationTimeConsumingData);
    }
}
