package Practice2.Practice22.CarFactory;



public class Limusine extends Car {

        Limusine() {
            super(CarType.Limusine);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building Limusine car");

        }
    }

