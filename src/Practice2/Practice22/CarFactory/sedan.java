package Practice2.Practice22.CarFactory;

public class sedan extends Car {

        sedan() {
            super(CarType.sedan);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building sedan car");

        }
    }

