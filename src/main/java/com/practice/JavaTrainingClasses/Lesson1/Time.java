package com.practice.JavaTrainingClasses.Lesson1;

public class Time {

    int hour = 18;
    int minute= 26;
    int second= 40;



    //60 sec = 1 min;
    //60 min = 1 hour;
    //18 hours = 18*60*60;
    //26 minutes = 26*60;
    //40 seconds = 40;

    //display like this: 18hr: 26min: 40sec;

    public static void main(String[] args) {
        //calculate and display the number of seconds since midnight.
        int secondsSinceMidnight = 18*3600 + 26*60 + 40;

        System.out.println("Number of Seconds since midnight: "+ secondsSinceMidnight);

        //Calculate and display the number of seconds remaining in the day.
        int secondsRemaining = 24*3600 - secondsSinceMidnight;

        System.out.println("Number of Seconds remaining in the day: "+ secondsRemaining);

        //Calculate and display the percentage of the day that has passed.
        double percentagePassed = (double)secondsSinceMidnight/(24*3600)*100;
        System.out.println("Percentage of the day that has passed: "+ percentagePassed + "%");

        //Change the values of hour, minute, and second to reflect the current time.
        // Then write code to compute the elapsed time since you started working on this exercise.
        int currentHour = 18;
        int currentMinute = 45;
        int currentSecond = 30;
        int elapsedTime = (currentHour - 18)*3600 + (currentMinute - 26)*60 + (currentSecond - 40);
        System.out.println("Elapsed time since you started working on this exercise: "+ elapsedTime + " seconds");


    }
}
