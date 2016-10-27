/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Badges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jovy
 */
public class Algorithms {

    public static void main(String[] flagg) {
        getBonAppetit();
    }

    static void getBonAppetit() {
        Scanner scan = new Scanner(System.in);
        int k = 1;
        //  k = scan.nextInt();
        int n = 4;
        // n = scan.nextInt();
        int total = 0;

        int actual = 0;

        int[] price = {3, 10, 2, 9};
        //  int[] price = new int[n];
        //fill array;
        for (int i = 0; i < n; i++) {
            // price = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (k != i) {
                total += price[i];
            }
        }
        int charged = 12;
        int split = total / 2;
        actual = charged - split;
        System.out.println("split: " + split);
        System.out.println("charged " + charged);
        System.out.println("actual " + actual);
        if (split == charged) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(actual);
        }

    }

    static void getRepeatedString() {
        String s = "abababababababababab";
        long n = 1000000000;

//        System.out.println("S: ");
//        for (long i = 0; i < n; i++) {
//            s += "a";
//        }
        System.out.println(s);

        System.out.println("Number: " + n);
        System.out.println("Strint: " + s.length());
        for (int front = 0; front < s.length() / 2; front++) {
            int last = s.length() - 1;
            int middleLeft = (s.length() / 2) + 1;
            int middleRight = (s.length() / 2) + 1 + (s.length() / 2);

        }

    }

    static void getSimilarStrings() {

    }

    static void getMarsExploration() {
        String s = "";//"SOSSPSSQSSORSOSSPSSQSSORSOSSPSSQSSORSOSSPSSQSSORSOSSPSSQSSORSOSSPSSQSSORSOSSPSSQSSORSOSSPSSQSSOR";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 0) {
                // to move by Three                
                for (int j = i; j < s.length(); j += 3) {
                    if (s.charAt(i) != 'S') {
                        counter++;
                    }//end of inner if statement for S
                    if (s.charAt(i + 1) != 'O') {
                        counter++;
                    }//end of inner if statement for O
                    if (s.charAt(i + 2) != 'S') {
                        counter++;
                    }//end of inner if statement for S
                    //Do not need to go all the way through the
                    //loop. Break to start at the next 3
                    break;

                }//end of inner loop

            }//end of if statement in outer loop
        }//end of outer loop
        //Print the number of miss SOS
        System.out.println(counter);

    }//End of mars getMars_Exploration

    static void getDivisibleSumPairs() {
        int n = 0;
        //not in uses
        int k = 3;
        int count = 0;
        int[] a = {1, 3, 2, 6, 1, 2};
        for (int i = 0; i < a.length; i++) {
            //The starting index for j is moved forward with I
            //Do have to look at pairs you have already 
            for (int j = i; j < a.length; j++) {
                if (i != j) {
                    if ((a[i] + a[j]) % k == 0) {
                        count++;
                    }
                } else {
                    continue;
                }
            }

        }
        System.out.println("Count: " + count);

    }//End of getDivisible_Sum_Pairs method

    static void getSockMerchant() {
        Set<Integer> arrayOfColors = new HashSet<>();
        int count = 0;
        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        for (int i = 0; i < array.length; i++) {

            if (arrayOfColors.contains(array[i])) {
                arrayOfColors.remove(array[i]);
                count++;
            } else {
                arrayOfColors.add(array[i]);

            }
        }
        System.out.println("Count: " + count);
        System.out.println("Set");
        for (Integer integer : arrayOfColors) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }//End of getSock_Merchant Method

    static void camelCase() {
        String s = "saveChangesInTheEditor";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if (str.matches("[A-Z]")) {
                count++;
            }

        }
        System.out.println(count);
    }//End of camelCase Method

}
