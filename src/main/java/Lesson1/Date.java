package Lesson1;

public class Date {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Date date = new Date();
        date.todayDate();

    }

    public void todayDate(){
        String day = "Friday";
        int date = 13;
        String month = "September";
        int year = 2019;

//        System.out.print("Today's Date is: " + date + ", " + day + " " + month + ", " + year);
        System.out.println("American Format: " + month + ", " + day + " " + date + ", " + year);
        System.out.println("European Format: " + month + ", " + day + " " + date + ", " + year);

//        American format: Thursday, July 18, 2019
//        European format: Thursday 18 July 2019

    }




}
