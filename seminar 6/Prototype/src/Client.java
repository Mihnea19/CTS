import java.util.HashMap;
import java.util.Map;

public class Client {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public Client() {
//        prototypes.put("A", new ConcretePrototypeA());
//        prototypes.put("B", new ConcretePrototypeB());
    }

    public Prototype create(String type) throws InterruptedException {
        Prototype prototypeToReturn = prototypes.get(type);
        if(prototypeToReturn == null)
        {
            System.out.println("Object needs to be created.");
            if(type=="A")
                prototypeToReturn = new ConcretePrototypeA();
            else
                prototypeToReturn = new ConcretePrototypeB();

            this.prototypes.put(type, prototypeToReturn);
        }

        return prototypeToReturn.clone();
    }
}
