package com.practice.JavaTrainingClasses.Lesson1;

import java.util.Random;
import java.util.Scanner;


public class GuessStarter {

        public static void main(String[] args) {
            // pick a random number
            Random random = new Random();

            int number = random.nextInt(100) + 1;
            System.out.println(number);

            //Modify the program to prompt the user; then use a Scanner to read a line of user input. Compile and test the program.

            Scanner scanner = new Scanner(System.in);
            System.out.print("I'm thinking of a number between 1 and 100.  What is it? ");
            int guess = scanner.nextInt();
            System.out.println("Your guess is: " + guess);

            //Read the user input as an integer and display the result. Again, compile and test.
            System.out.println("The number I was thinking of is: " + number);

            //Compute and display the difference between the user’s guess and the number that was generated.
            System.out.println("You were off by: " + Math.abs(number - guess));


        }

}
