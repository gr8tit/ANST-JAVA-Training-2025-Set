package com.practice.JavaTrainingClasses.Lesson3;

import java.util.Scanner;

public class Femat {

    public static void main(String[] args) {

        //Write a program named Fermat.java that inputs four integers (a, b, c, and n) and
        // checks to see if Fermat’s theorem holds.
        //If n is greater than 2 and an + bn = cn,
        // the program should display “Holy smokes, Fermat was wrong!”
        // Otherwise, the program should display “No, that doesn’t work.”

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of c: ");
        int c = scanner.nextInt();
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();


        //an + bn = cn
        //n>2 = 3
        //21 + 35 = 56

        if(n>2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)){
            System.out.println("Holy smokes, Fermat was wrong!");

        }else {
            System.out.println("No, that doesn’t work.");
        }


    }
}
