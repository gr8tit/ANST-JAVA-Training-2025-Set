package com.practice.JavaTrainingClasses;

import java.util.*;
import java.util.Random;

public class Data {


    public static void main(String[] args) {
        Data date = new Data();
        date.random();
//        date.printDate();
//        date.convert();
//        date.scannerBug();
//        date.convertTemp();
//        System.out.println("Hello world!");

    }
//    String day = "Thursday";
//    String month = "July";
//    int date = 18;
//    int year = 2019;
    double d = (4.0/3.0);
    int feet = 76/12; //quotient
    int inches = 76%12; //remainder

//    public void printDate(){
////        System.out.println("Today is " + day + ", " + month + " " + date + ", " + year);
////        System.out.println("American Format:" + day + ", " + month + " " + date + ", " + year);
////        System.out.println("European Format:" + day + ", " + date + " " + month + ", " + year);
////        System.out.printf(String.valueOf(d)); //Type case double to string
////        System.out.printf("%f", d);
//        System.out.println(feet);
//        System.out.println(inches);
//
//    }
//    public void convert(){
//        double cm;
//        int feet;
//        int inches;
//        int remainder;
//        final double CM_PER_INCH = 2.54;
//        final int INCHES_PER_FOOT = 12;
//
//        //Read the number of cm from the user
//        Scanner in = new Scanner(System.in);
//        System.out.print("Exactly how many cm? ");
//        cm = in.nextDouble();
//
////        Convert and output the result
//        inches = (int) (cm / CM_PER_INCH);
//        feet = inches / INCHES_PER_FOOT;
//        remainder = inches % INCHES_PER_FOOT;
//        System.out.printf("%.2f cm = %d feet, %d inches\n", cm, feet, remainder);
//    }
//

//    public void scannerBug(){
//        Scanner in = new Scanner(System.in);
//
//        System.out.printf("What is your age? ");
//        int age = in.nextInt();
//        in.nextLine(); //Read the newline
//
//        System.out.print("What is your name? ");
//        String name = in.nextLine();
//
//        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
//
//    }
//    public void convertTemp(){
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a temperature in Celcius: ");
//
//        double C = in.nextDouble();
//        double F = C * (9/5 + 32);
//        System.out.printf("%.1f C = %.1f F", C, F);
//
//
//
//    }


//    Like the Scanner class in this chapter, Random has to be imported before we can use it. And as with Scanner, we have to use the new operator to create a Random (number generator).
//
//    Then we can use the method nextInt to generate a random number. In this example, the result of nextInt(100) will be between 0 and 99, including both. Adding 1 yields a number between 1 and 100, including both.
//
//    The definition of GuessStarter is in a file called GuessStarter.java, in the directory called ch03, in the repository for this book.


    public void random(){
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + (number - guess));
    }


}
