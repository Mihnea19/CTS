public class RegularCarBuilder implements  CarBuilder{
    private Car m;
    RegularCarBuilder(){
        this.m= new RegularCar();
    }

    @Override
    public void buildChassis() {
        this.m.setChassis("Sasiu de masina clasica");
    }

    @Override
    public void buildWheels() {
        this.m.setWheels("Roti cu capace de masina clasica");
    }

    @Override
    public void buildEngine() {
        this.m.setEngine("Motor disel");
    }

    @Override
    public void buildInteriorDesign() {
        this.m.setInsideDesign("interior masina clasica");
    }

    public void buildAdditives(){
        ((RegularCar)m).setAdditives("AdBlue diesel");
    }

    @Override
    public Car getCar() {
        return this.m;
    }
}
