public class Main {

    public static void main(String[] args) throws InterruptedException {
        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");


        prototypeA = client.create("A");
        prototypeB = client.create("B");
    }
}
