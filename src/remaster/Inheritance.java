package remaster;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Car", "Black", 4, 5);
        Audi audi = new Audi("Audi", "Red", 4, 1, 1);

        /*car.accelerate();
        audi.accelerate();
        car.brake();
        audi.brake();*/

        audi.superDemo();
    }

    public static class Car {
        public String name;
        public String color;
        public int wheels;
        public int passengersCapacity;

        public Car(String name, String color, int wheels, int passengersCapacity) {
            this.name = name;
            this.color = color;
            this.wheels = wheels;
            this.passengersCapacity = passengersCapacity;
        }

        public void demo() {
            System.out.println("Super class");
        }

        public void accelerate() {
            System.out.println("Car accelerated!");
        }

        public void brake() {
            System.out.println("Car stopped!");
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getWheels() {
            return wheels;
        }

        public int getPassengersCapacity() {
            return passengersCapacity;
        }
    }

    public static class Audi extends Car {

        private int gearBox;
        private int sunRoof;

        public Audi(String name, String color, int passengersCapacity, int gearBox, int sunRoof) {
            super(name, color, 4, passengersCapacity);
            this.gearBox = gearBox;
            this.sunRoof = sunRoof;
        }

        private void openSunRoof() {
            System.out.println("Sunroof open!");
        }

        // METHOD OVERRIDING
        @Override
        public void accelerate() {
            System.out.println("Audi accelerated!");
            super.accelerate();
        }

        private void superDemo() {
            demo();
            super.demo();
        }

        @Override
        public void demo() {
            System.out.println("Base class");
        }
    }
}
