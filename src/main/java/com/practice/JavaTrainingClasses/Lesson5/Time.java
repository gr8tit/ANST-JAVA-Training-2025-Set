package com.practice.JavaTrainingClasses.Lesson5;

public class Time {

    public int hour;
    public int minute;
    private int second;

    public static void main(String[] args) {
     //instantiate the Time object
        Time tim = new Time(5, 8, 9);
        tim.hour = 11;

        }

      //constructor
       public Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;

       }

         //method to set the time
        public void setHour(int hour) {
            this.hour = hour;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        //method to get the time
        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }


}
