package com.practice.JavaTrainingClasses.Lesson4;

public class While {

    public static void main(String[] args){
        int n = 3;
//
//        while (n > 0) { //first check the condition
//            System.out.println(n); //next
//            n = n - 1;
//        }
//        System.out.println("Blastoff!");

//        while (n != 1) {
//            System.out.println(n);  //first check the condition
//            if (n % 2 == 0) {         // n is even
//                n = n / 2;
//            } else {                  // n is odd
//                n = 3 * n + 1;
//            }
//        }

        //3   n = 3
        //10  n = 10
        //5  10/2 = 5
        //16  5*3 + 1 = 16
        //8  16/2 = 8
        //4  8/2 = 4
        //2  4/2 = 2  // skip//1  2/2 = 1


        //increment and decrement
//        i++ = i = i + 1  i += 1 =>   i = i + 1   i += 2 => i = i + 2 i += 3 => i = i + 3
//                i-- = i = i - 1 i -= 1 =>   i = i - 1   i -= 2 => i = i - 2 i -= 3 => i = i - 3
//

//        for (int i = 2; i <= 8; i += 2) {
//            System.out.print(i + ", ");
//        }
//        System.out.println("Who do we appreciate?");

//2 i
//4 i
//6 i
//8 i
//10 i

////        Nested loops
//        for (int x = 1; x <= 10; x++) {
//            for (int y = 1; y <= 10; y++) {
//                System.out.printf("%4d", x * y);
//            }
//            System.out.println();
//        }

        // 2  1+1, 2+1,3+1,4+1,5+1,6+1,7+1,8+1,9+1
        //2  2+1, 3+1,4+1,5+1,6+1,7+1,8+1,9+1
        //
//2,3,4,5,6,7,8,9,10
//2,3,4,5,6,7,8,9,10

        //String iteration
//        String fruit = "banana";
        //length of the string is 6
        //index of the string is 0,1,2,3,4,5
        //INDEX OF LAST CHARACTER IS LENGTH - 1 = 6 - 1 = 5

//        for (int i = 0; i < fruit.length(); i++) {
//            char letter = fruit.charAt(i);
//            System.out.println(letter);
//        }//0,1,2,3,4,5 //b,a,n,a,n,a


//        public static String reverse(String s) {
//            String r = "";
//            for (int i = s.length() - 1; i >= 0; i--) {
//                r += s.charAt(i);
//            }
//            return r;
//        }

    }





}
