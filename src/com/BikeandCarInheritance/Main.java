package com.BikeandCarInheritance;

public class Main extends  Bike{

    public static void main(String[] args) {
        Main main = new Main();
        main.door();
        main.go();
        main.pedal();
        main.stop();
    }
    public void door(){
        System.out.println("car has four doors");
    }
    public void pedal(){
        System.out.println("Bike has 2 pedals");
    }
}
