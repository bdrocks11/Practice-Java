package com.sana.sanacollection;


import java.util.ArrayList;

public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<Car> cars = new ArrayList<Car>();
            cars.add(new Car("BMW", 52400));
            cars.add(new Car("Toyota", 66000));
            cars.add(new Car("Audi", 44000));

            for(Car car: cars) {
                car.printDetails();
            }
        }
    }

    class Car {
    String name;
    int miles;



        public Car(String name, int miles) {
            this.name = name;
            this.miles = miles;
        }

        public void printDetails() {
            System.out.println(name + " travelled " + miles + " miles.");
        }
    }


