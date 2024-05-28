public class Main {

    public static void main(String[] args) {
        CarBuilder builder = new ElectricCarBuilder();
        CarEngineer inginer = new CarEngineer(builder);
        inginer.buildCar();;
        Car masina = inginer.getCar();
        System.out.println(masina.showDetails());

        builder= new RegularCarBuilder();
        inginer= new CarEngineer(builder);
        inginer.buildCar();
        masina= inginer.getCar();
        System.out.println(masina.showDetails());
    }

}
