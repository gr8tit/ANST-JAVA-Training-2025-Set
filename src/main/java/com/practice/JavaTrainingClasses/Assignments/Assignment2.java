package com.practice.JavaTrainingClasses.Assignments;

import java.util.Scanner;

public class Assignment2 {

    //Multiadd Exercise
//    public static void main(String[] args) {
//        multadd(1.0, 2.0, 3.0);
//
//        //conpute the following
//        //sin(pi/4) + cos(pi/4)/2
//        //log10 + log20
//        double compute1 = multadd(1.0, Math.sin(Math.PI/4), Math.cos(Math.PI/4)/2);
//        System.out.println(compute1);
//
//        double compute2 = multadd(1.0, Math.log(10), Math.log(20));
//        System.out.println(compute2);
//
//        System.out.println(expSum(1.0));
//
//
//    }
//
//    public static double expSum(double x) {
////        return Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
//        return  multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
//
//
//
//    }
//    public static double multadd(double a, double b, double c) {
//        return a * b + c;
//
//    }

//    //Triangle Exercise
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first lenght a: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Enter the second lenght b: ");
//        int b = scanner.nextInt();
//
//        System.out.println("Enter the third lenght c: ");
//        int c = scanner.nextInt();
//
//
//        //Check if the three lengths form a triangle
//        if(a + b > c && a + c > b && b + c > a) {
//            System.out.println("The three lengths form a triangle");
//        } else {
//            System.out.println("The three lengths do not form a triangle");
//
//        }
//
//
//
//    }
//
//    //Method to take in 3 integers and return true if they form a triangle
//    //If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
//    public static boolean isTriangle(int a, int b, int c) {
//        return a + b > c && a + c > b && b + c > a;
//
//    }

    //Doubloon Exercise
//    public static void main(String[] args) {
//
//        //Iterate through the string
//        //Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial, boob, Caucasus, coco, Dada, deed, Emmett
//        Scanner scanner = new Scanner(System.in);
//
//
//        String[] words = {"Abba", "Anna", "appall", "appearer", "appeases", "arraigning", "beriberi", "bilabial", "boob", "Caucasus", "coco", "Dada", "deed", "Emmett"};
//        for (String word : words) {
//            System.out.println(isDoubloon(word));
//
//        }
//        System.out.println("Enter a word: ");
////        scanner.nextLine();
//        String word = scanner.nextLine();
//        System.out.println(isDoubloon(word));
//
//
//
//
//    }
//
//    public static boolean isDoubloon(String s) {
//        //Convert the string to lower case
//        s = s.toLowerCase();
//        //Iterate through the string
////        for (int i = 0; i < s.length(); i++) {
////            //Check if the character at index i is equal to the character at index i + 1
////            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
////                return false;
////            }
////        }
//
//        int[] counts = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                counts[c - 'a']++;
//            }
//        }
//        //Check how many times each character appears in the string
//
//        for(int count : counts) {
//            if(count != 0 && count != 2) {
//                return false;
//            }
//
//        }
//
//        return true;
//
//
//
//
//    }

    //Scrabble Exercise

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String x = scanner.nextLine();
        System.out.println("Enter the second word: ");
        String y = scanner.nextLine();
        System.out.println(canSpell(x, y));


    }

    public static boolean canSpell(String x, String y){
        int[] letters = new int[26];

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a']++;
            }
        }

        for(int i = 0; i < y.length(); i++) {
            char c = y.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a']--;
            }

        }



        return true;

    }

}
