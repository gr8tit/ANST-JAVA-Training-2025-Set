package com.practice.JavaTrainingClasses.Lesson4;

public class Arrays {
    //Creating arrays
//    int[] vehicles; //declaring an array of integers
//    vehicles = new int[4]; //initializing an array of integers with 4 elements
//    int[] vehicles = {1, 2, 3, 4}; //declaring and initializing an array of integers with 4 elements


    //

    public static void main(String[] args){

////        int[] counts = new int[4];
//
//        int[] counts = {1, 2, 3, 4};
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(counts[i]);
//
//            //index 1, 2, 3 counts[0], counts[1], counts[2], counts[3]
//            //1, 2, 3, 4
//        }

        //Traversing an array

        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] *= a[i]);
        }

        //a[0] = 1*1 = 1 = 1
        //a[1] = 2*1 = 2 =2 * 2 = 4
        //a[2] = 3*1 = 3= 3*3 = 9
        //a[3] = 4*1 = 4 = 4*4 = 16
        //a[4] = 5*1 = 5 = 5*5 = 25

    }

}
