package oopsexampel;

public class InterfaceEx2 {
    interface Vehicle {
        void start();

        default void fuelType() {
            System.out.println("Petrol or Diesel");
        }
    }

    static class Car implements Vehicle {
        public void start() {
            System.out.println("Car starts with key");
        }
    }
        public static void main(String[] args) {
            Car c = new Car();
            c.start();
            c.fuelType();
        }
    }

