public class ElectricCarBuilder implements  CarBuilder{

        private Car car;
        ElectricCarBuilder(){
            this.car= new ElectricCar();
        }

        @Override
        public void buildChassis() {
            this.car.setChassis("Sasiu de masina electrica");
        }

        @Override
        public void buildWheels() {
            this.car.setWheels("Roti special proiectate pentru masina electrica");
        }

        @Override
        public void buildEngine() {
            this.car.setEngine("Motor electric");
        }

        @Override
        public void buildInteriorDesign() {
            this.car.setInsideDesign("Interior masina electrica");
        }

        public void buildCharger(){
            ((ElectricCar)car).setCharger("Incarcator rapid");
        }

        @Override
        public Car getCar() {
            return this.car;
        }
    }

