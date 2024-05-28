public class CarEngineer {
    private CarBuilder builder;

    CarEngineer(CarBuilder builder){
        this.builder= builder;
    }

    public void buildCar(){
        builder.buildEngine();;
        builder.buildWheels();
        builder.buildInteriorDesign();
        builder.buildChassis();;
        if(builder instanceof ElectricCarBuilder)
            ((ElectricCarBuilder)builder).buildCharger();
        else
            ((RegularCarBuilder)builder).buildAdditives();
    }

    public Car getCar() {
        return builder.getCar();
    }
}
