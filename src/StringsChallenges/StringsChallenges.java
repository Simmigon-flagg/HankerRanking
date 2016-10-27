/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsChallenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jovy
 */
public class StringsChallenges {

    public static void main(String[] args) {

        //   getEnterDataUsingLoops();
        getJavaAnagrams();
    }

    static void getJavaAnagrams() {
        String anagram = "Simmigon";
        String A = "";
        String isAnagram = "Not Anagrams";
        for (int i = 0; i < anagram.length(); i++) {

            System.out.println(anagram);

            A = anagram.substring(1, 2);

            anagram = anagram.replaceFirst(anagram.substring(i + 1,i + 2), anagram.substring(i,i+ 1));
            anagram = anagram.replaceFirst(anagram.substring(i, i+1), A);
            System.out.println(anagram);
            A = anagram.substring(i+2,i + 3);

            ///System.out.println(anagram);
            anagram = anagram.replaceFirst(anagram.substring(2, 3), anagram.substring(1, 2));
            //System.out.println(anagram);
            anagram = anagram.replaceFirst(anagram.substring(1, 2), A);
            for (int j = 0; j < anagram.length(); j++) {

                System.out.println(anagram);

                A = anagram.substring(1, 2);

                anagram = anagram.replaceFirst(anagram.substring(1, 2), anagram.substring(0, 1));
                anagram = anagram.replaceFirst(anagram.substring(0, 1), A);
                System.out.println(anagram);
                A = anagram.substring(2, 3);

                ///System.out.println(anagram);
                anagram = anagram.replaceFirst(anagram.substring(2, 3), anagram.substring(1, 2));
                //System.out.println(anagram);
                anagram = anagram.replaceFirst(anagram.substring(1, 2), A);
            }
        }
//        System.out.println(anagram);
//        A = anagram.substring(1, 2);
//
//        anagram = anagram.replaceFirst(anagram.substring(1, 2), anagram.substring(0, 1));
//        anagram = anagram.replaceFirst(anagram.substring(0, 1), A);
//        System.out.println(anagram);
//        A = anagram.substring(2, 3);
//
//        ///System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(2, 3), anagram.substring(1, 2));
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(1, 2), A);
//        System.out.println(anagram);
//        //Swap and start again with A
//        System.out.println("==========================================");
//        anagram = "ACT";
//        System.out.println(anagram);
//        A = anagram.substring(1, 2);
//
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(1, 2), anagram.substring(0, 1));
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(0, 1), A);
//        System.out.println(anagram);
//        A = anagram.substring(2, 3);
//
//        ///System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(2, 3), anagram.substring(1, 2));
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(1, 2), A);
//        System.out.println(anagram);
//
//        System.out.println("==========================================");
//        anagram = "ATC";
//        System.out.println(anagram);
//        A = anagram.substring(1, 2);
//
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(1, 2), anagram.substring(0, 1));
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(0, 1), A);
//        System.out.println(anagram);
//        A = anagram.substring(2, 3);
//
//        ///System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(2, 3), anagram.substring(1, 2));
//        //System.out.println(anagram);
//        anagram = anagram.replaceFirst(anagram.substring(1, 2), A);
//        System.out.println(anagram);
//
////        anagram = anagram.replace(A, ' ');       
//        System.out.println(anagram);
//        anagram = anagram.replace(C, A);        
//        System.out.println(anagram);
//        anagram = anagram.replace(' ',C);
//        System.out.println(anagram);
//        
        //System.out.println(anagram.indexOf("C"));
    }

    static void getJavaStringReverse() {
        //palindrome
        String n = "madam";
        String isPalindrome = "Yes";
        for (int i = 0; i < /*Middle*/ (n.length() / 2 + 1) - 1; i++) {
            if (n.charAt(i) != n.charAt((n.length() - i) - 1)) {
                isPalindrome = "No";
            }
        }
        System.out.println(isPalindrome);
    }

    static void getCountTheDigit_1() {
        //This is count all the one's in a single number
        int sum;

        //count the number of digitl
        // System.out.println(sum);
    }

    static void getEnterDataUsingLoops() {
        Scanner in = new Scanner(System.in);

        System.err.println("Enter in the number of arrays ");
        int numberOfArray = in.nextInt();

        String m = "Hacker"; //in.nextLine();
        String[] strings = new String[numberOfArray];
        // This is one word at a time. 
        // This isn't the whole line.        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.next();
        }

        for (int i = 0; i < strings.length; i++) {
            String even = "";
            String odd = "";

            for (int j = 0; j < strings[i].length(); j++) {

                if (j % 2 == 0) {
                    // System.out.print(j + " " + strings[i].charAt(j) + " ");
                    even += strings[i].charAt(j);

                } else {
                    // System.out.print(j + "||" + strings[i].charAt(j) + "|| ");
                    odd += strings[i].charAt(j);
                }

            }
            System.out.println(even + " " + odd);
        }
    }

    static void getJavaStringCompare() {
        Scanner in = new Scanner(System.in);
        //String s = in.next();
        //   String s = "welcometojava";
        String s = "fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        //int n = in.next();
        int n = 100;
        int max = -1;
        int min = 200;
        String maxString = "";
        String minString = "";

        for (int i = 0; i < s.length() - n + 1; i++) {

            if (s.length() - n + 1 == i) {
                break;
            }
            // A = 0 amd lowercase z = 57
            if (min > (-1 * "A".compareTo(s.substring(i, i + 1)))) {
                minString = "";
                minString = s.substring(i, i + n);
                min = -1 * "A".compareTo(s.substring(i, i + 1));
            }
            if (max < (-1 * "A".compareTo(s.substring(i, i + 1)))) {
                maxString = "";
                maxString = s.substring(i, i + n);
                max = -1 * "A".compareTo(s.substring(i, i + 1));
            }
        }
        System.out.println(minString);
        System.out.println(maxString);

    }

    static void JavaSubstring() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for (int i = start; i < end - 1; i++) {
            System.out.print(S.charAt(i));

        }
    }

}
