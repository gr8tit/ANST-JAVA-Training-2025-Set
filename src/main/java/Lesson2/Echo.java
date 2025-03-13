package Lesson2;

import java.util.Scanner;

import static java.lang.System.in;

public class Echo {

    public static void main(String[] args) {
        Scanner scnner = new Scanner(in);
        String name;
        int age;

        System.out.print("What is your age? ");
        age = scnner.nextInt();
        scnner.nextLine();
        System.out.print("What is your name? ");
        name = scnner.nextLine();

        System.out.printf("Hello %s, age %d\n", name, age);
//
//        int age = 30;
//        scnner.nextLine();
//
//        System.out.print("What is your age: " );
//
//
//        System.out.print("You will be: " + (age + 1) + "next year");

        //Formating

//        System.out.println(4.0/3.0);
//        System.out.printf("%.2f", 4.0/3.0);


    }
}
