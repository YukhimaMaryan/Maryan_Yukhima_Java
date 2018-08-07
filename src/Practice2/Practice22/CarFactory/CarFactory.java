package Practice2.Practice22.CarFactory;

    public class CarFactory {
        public static Car buildCar(CarType model) {
            Car car = null;
            switch (model) {
                case hatchback:
                    car = new hatchback();
                    break;

                case sedan:
                    car = new sedan();
                    break;

                case mini:
                    car = new mini();
                    break;

                case SUV:
                    car = new SUV();
                    break;
                case Limusine:
                    car = new Limusine();
                    break;

            }
            return car;
        }
    }

