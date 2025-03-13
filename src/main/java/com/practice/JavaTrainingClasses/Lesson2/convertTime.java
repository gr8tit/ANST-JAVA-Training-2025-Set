package com.practice.JavaTrainingClasses.Lesson2;

import java.util.Scanner;

public class convertTime {

    //if 1 hour = 3600 seconds, how many hours is in 5000 seconds?

    public static void main(String[] args) {

        convertTime convertTime = new convertTime();
        convertTime.timeConvert();


    }

    public void timeConvert() {
        // Step 1: Prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Seconds: ");

        // Step 2: Read an integer from the keyboard
        int totalSeconds = scanner.nextInt();
        scanner.close();

        int hours = totalSeconds / 3600;            // 1 hour = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60;   // Remaining seconds converted to minutes
        int seconds = totalSeconds % 60;           // Remaining seconds after minutes


        // Step 3: Calculate hours, minutes, and seconds

        // Step 4: Display the result using printf
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n",
                totalSeconds, hours, minutes, seconds);


    }





}
