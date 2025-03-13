package com.practice.JavaTrainingClasses.Lesson5;

public class TimeClient {

        public static void main(String[] args) {
            Time time = new Time(5, 8, 9);
            time.hour = 20;
            time.minute = 30;
            time.getHour();
            time.getMinute();
            time.getSecond();
        }


}
