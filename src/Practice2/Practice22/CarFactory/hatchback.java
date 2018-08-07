package Practice2.Practice22.CarFactory;


public class hatchback extends Car {

        hatchback() {
            super(CarType.hatchback);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building hatchback car");


        }
    }

