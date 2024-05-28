public class RegularCar implements Car {
    private String chassis;
    private String wheels;
    private String engine;
    private String insideDesign;
    private String additives;

    @Override
    public void setChassis(String chassis){
        this.chassis= chassis;
    }

    @Override
    public void setWheels(String wheels) {
        this.wheels=wheels;
    }

    @Override
    public void setEngine(String engine) {
        this.engine= engine;
    }

    @Override
    public void setInsideDesign(String insideDesign) {
        this.insideDesign=insideDesign;
    }

    public void setAdditives(String additives){
        this.additives= additives;
    }

    @Override
    public String showDetails() {
        return  "MasinaClasica{"+
                "sasiu=' " + chassis +'\''+
                ", roti=' " + wheels + '\''+
                ", motor=' " + engine + '\''+
                ", interior=' " + insideDesign + '\''+
                ", aditivi=' " + additives + '\''+ '}';
    }
}
