package Practice2.Practice22.CarFactory;

public class SUV extends Car {

        SUV() {
            super(CarType.SUV);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building SUV car");

        }
    }

