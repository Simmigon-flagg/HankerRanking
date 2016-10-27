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

        getCountLetters("Simmigon");

    }

    static void getCountLetters(String string) {
        int sumletters = 0;
        //remove spaces
        string = string.replaceAll(" ", "");
        //make case insensitive
        string = string.toLowerCase();
        //make char array
        char[] Letters = string.toCharArray();
        //allo space for alphabet
        int[] alphabet = new int[26];
        
        // For each lowercase letter in the array, count i
        for (int i = 0; i < Letters.length; i++) {
            alphabet[Letters[i] - 'a']++;
        }
        //for each letter in the alphabet not equal to
        //0 print it
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                System.out.println(alphabet[i] + " " + (char) (i + 'a'));
            }
        }
        //sum all the letter in the string
        for (int i = 0; i < alphabet.length; i++) {
            sumletters += alphabet[i];
        }

//            for (int i = 0; i < freqB.length; i++) {
//                if (freqA[i] == freqB[i]) {
//                    anagramIs = "Anagrams";
//                     isAnagram = true; 
//                } else {
//                    anagramIs = "Not Anagrams";
//                    isAnagram = false;
//                    break;
//                }
//
//            }
          System.out.println(sumletters);       
    }

    static boolean getJavaAnagramsfreq() {
        String anagramIs = "Not Anagrams";
        String a = "margana";
        String b = "margana";
        boolean isAnagram = false;
        if (a.length() == b.length()) {
            a = a.toLowerCase();
            b = b.toLowerCase();

            char[] A = a.toCharArray();
            char[] B = b.toCharArray();
            int[] freqA = new int[26];
            int[] freqB = new int[26];
            // For each lowercase letter in the array, count i

            for (int i = 0; i < A.length; i++) {
                freqA[A[i] - 'a']++;
                freqB[B[i] - 'a']++;
            }

            for (int i = 0; i < freqB.length; i++) {
                if (freqA[i] == freqB[i]) {
                    anagramIs = "Anagrams";
                    isAnagram = true;
                } else {
                    anagramIs = "Not Anagrams";
                    isAnagram = false;
                    break;
                }

            }

        }

        System.out.println(anagramIs);
        return isAnagram;
    }

    static void getJavaAnagrams() {
        String a = "simmigon";
        String b = "simmigon";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            String atemp = a.substring(i, i + 1);
            for (int j = 0; j < b.length(); j++) {
                //is There a letter in b that
                //match a
                String btemp = b.substring(j, j + 1);
                System.out.println(atemp + " " + btemp + "\t" + (atemp.equals(btemp)));
                if (atemp.equals(btemp)) {
                    b = b.replaceFirst(btemp, "");
                    System.out.println(a);
                    System.out.println("Remaining:" + b);

                    count++;
                    break;
                }
                if (a.charAt(i) == b.charAt(j)) {

                }//end of if
            }//inner for loop
        }//outter for loop

        //   System.out.println(count);
        System.out.println(b);
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
