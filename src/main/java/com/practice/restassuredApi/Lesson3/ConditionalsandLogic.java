package com.practice.restassuredApi.Lesson3;

public class ConditionalsandLogic {

    public static void main(String[] args){

//        int x = 8;

//        if (x % 2 == 0) {
//            System.out.println("x is even");
//
//        }
//
//        else{
//            System.out.println("x is odd");
//

        //else if chaining
//        }
//        if (x > 0) {
//            System.out.println("x is positive");
//        } else if (x < 0) {
//            System.out.println("x is negative");
//        } else {
//            System.out.println("x is zero");
//        }

        //Nested If else

//        if (x > 0) {
//            System.out.println("x is positive");
//        } else {
//            if (x < 0) {
//                System.out.println("x is negative");
//            } else {
//                System.out.println("x is zero");
//            }
//        }

        //Switch case

//        int number = 3;
//        String word;
//
//        switch (number) {
//            case 1:
//                word = "one";
//                System.out.println("one");
//                break;
//            case 2:
//                word = "two";
//                System.out.println("two");
//                break;
//            case 3:
//                word = "three";
//                System.out.println("three");
//                break;
//            default:
//                word = "unknown";
//                System.out.println("unknown");
//                break;
//        }




//        return false;

        isSingleDigit(5);

    }


//    public static boolean isSingleDigit(int x) {
//
//        return x > -10 && x < 10;
//
//    }

    //Boolean logic

        public static boolean isSingleDigit(int x) {

            if (x > -10 && x < 10) {

                return true;
            } else {
                return false;
            }
        }
}
