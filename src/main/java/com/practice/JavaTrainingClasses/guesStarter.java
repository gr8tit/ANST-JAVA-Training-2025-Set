package com.practice.JavaTrainingClasses;

import java.util.Random;
import java.util.Scanner;


public class guesStarter {
    /**
     * Starter code for the "Guess My Number" exercise.
     */

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        //prompt the user
        Scanner in = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1 and 100.  What is it? ");
        int guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

        // display the difference between the guess and the number
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + Math.abs(number - guess));



    }
//    Modify the program to prompt the user;
//    then use a Scanner to read a line of user input.
//    Compile and test the program.
//    Read the user input as an integer and display the result.
//    Again, compile and test.
//    Compute and display the difference between the user’s guess and the number that was generated.

}
