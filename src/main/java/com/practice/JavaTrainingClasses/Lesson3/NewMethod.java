package com.practice.JavaTrainingClasses.Lesson3;

public class NewMethod {

//    public static void newLine() {
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        System.out.println("First line.");
//        newLine();
//        System.out.println("Second line.");
//    }

//    public static void printTwice(String s) {
//        System.out.println(s);
//        System.out.println(s);
//    }
//
    public static void main(String[] args) {
//        printTwice("Don't make me say this twice!");
        double radius = 5.0;;
        calculateArea(radius/2);

    }

    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;

    }
}
