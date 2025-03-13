package com.practice.JavaTrainingClasses.Lesson1;

public class Hello {

    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.println("Cruel World");
        //Print hello world to the screen
        Hello hello = new Hello();
        hello.printTime();
    }

    public void printTime(){
        int hour = 11;
        int minute = 59;
        System.out.println("The current time is: " + (hour * 60 + minute )+ ":" + minute);

        System.out.println(1 + 2 + "Hello");
        System.out.println("Hello" + 1 + 2);

    }

//    //Declaring Variables
//    String message;
//
//    //Assigning values to variables
//    message = "I love you";
//
//    //Initialization of a variable
//    String vehicle = "Toyota";
//
//
//    //Memory diagrams
//    int x = 5;
//    int y= x;
//    x = 10;
//
//    //print variables
//    System.out.println("The value of x is: " + x );

}
