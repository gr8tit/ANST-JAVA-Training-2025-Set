package com.practice.JavaTrainingClasses.Lesson5;

public class Cars extends Vehicles {

    public Cars(String brand, String model, int year) {
        super(brand, model, year);
    }

   Vehicles cars = new Vehicles("Toyota", "Camry", 2024);

    public void getCarName(){
        cars.getVehicleName();
        cars.vehicleName = "Camry";
    }

//    public static void main(String[] args) {
////        System.out.println("Which car do you want to buy?");
//        Cars car = new Cars("Toyota", "Camry", 2024);
//        car.getCarName();
//
//    }



}
