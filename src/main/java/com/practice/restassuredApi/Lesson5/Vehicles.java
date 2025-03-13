package com.practice.restassuredApi.Lesson5;

public class Vehicles {


    public String vehicleType;
    public String vehicleName;
    public String vehicleModel;
    public String vehicleColor;
    public String vehicleYear;
    public String vehiclePrice;
    public String vehicleMileage;
    public String vehicleCondition;

    public Vehicles(String brand, String model, int year) {
        this.vehicleType = brand;
        this.vehicleName = model;
        this.vehicleModel = model;
        this.vehicleYear = Integer.toString(year);
    }

    public static void main(String[] args) {
        System.out.println("Which vehicle do you want to buy?");
    }

    public void getVehicleType() {
        System.out.println("Vehicle Type: " + vehicleType);
    }

    public void getVehicleName() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    public void getVehicleModel() {
        System.out.println("Vehicle Model: " + vehicleModel);
    }

    public void getVehicleColor() {
        System.out.println("Vehicle Color: " + vehicleColor);
    }


}
