package Practice2.Practice22.CarFactory;

public class mini extends Car {

        mini() {
            super(CarType.mini);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building mini car");

        }
    }

