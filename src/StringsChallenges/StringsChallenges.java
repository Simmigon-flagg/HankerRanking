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
        System.out.println(sumletters);
    }

    static void TryAndCount() {
        String s = "simmigon Flagg";
        String d = "Denzel Flagg";
        s = s.toLowerCase().replaceAll(" ", "");
        d = d.toLowerCase().replaceAll(" ", "");

        char[] sLetter = s.toCharArray();
        int[] alphaS = new int[26];
        int[] alphaD = new int[26];

        for (int i = 0; i < sLetter.length; i++) {
            alphaS[sLetter[i] - 'a']++;
        }
        for (int i = 0; i < alphaS.length; i++) {
            if (alphaS[i] != 0) {
                System.out.println(alphaS[i] + " " + (char) (i + 'a'));
            }
        }
        int sumS = 0;
        for (int i = 0; i < alphaS.length; i++) {
            sumS+= alphaS[i];
            
        }
        System.out.println(sumS);
        char[] dLetter = s.toCharArray();
        int[] dCount = new int[26];
        for (int i = 0; i < dLetter.length; i++) {
            dCount[dLetter[i] - 'a']++;
        }
        int sumD = 0;
        for (int i = 0; i < alphaS.length; i++) {           
           sumD += alphaD[i];           
        }
        System.out.println(sumD);
      

    }

    static void getJavaStringTokens() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scan.nextLine();
        int c = 0;
        while (scan.hasNext()) {
            System.out.println(c++);
            String g = scan.next();
            System.out.println(g);
        }
    }

    static void getJavaStringCompareAll() {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int max = -1;
        int indexMax = -1;
        int indexMin = 58;
        int min = 58;
        int n = 4;
        for (int i = 0; i < 26; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print(A.substring(i, i + 1) + " ");
            System.out.print(-1 * "A".compareTo(A.substring(i, i + 1)) + " ");
        }
        System.out.println("");

        for (int i = 0; i < 26; i++) {
            if (i % 10 == 0) {
                System.out.println("");
            }
            System.out.print(a.substring(i, i + 1) + " ");
            System.out.print(-1 * "A".compareTo(a.substring(i, i + 1)) + " ");
        }
        System.out.println("");
        System.out.println("");
        String Aa = A.concat(a);
        System.out.println(Aa);
        for (int i = 0; i < Aa.length() - n; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }

            System.out.print(Aa.substring(i, i + 1) + " ");
            if (max < -1 * "A".compareTo(Aa.substring(i, i + 1))) {
                max = -1 * "A".compareTo(Aa.substring(i, i + 1));
                indexMax = i;
                System.out.println("MaxIndex" + indexMax);
            }
            if (min > -1 * "A".compareTo(Aa.substring(i, i + 1))) {
                min = -1 * "A".compareTo(Aa.substring(i, i + 1));
                indexMin = i;
                System.out.println("MinIndex" + indexMin);
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("indexMax " + indexMax);
        System.out.println("indexMin " + indexMin);

        System.out.println("Max " + max + " Letter " + Aa.substring(indexMax, indexMax + n));
        System.out.println("Max " + max + " Letter " + Aa.substring(indexMin, indexMin + n));

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

            //The array could be differen size
            for (int i = 0; i < A.length; i++) {
                freqA[A[i] - 'a']++;
               
            }
            //The array could be differen size
            for (int i = 0; i < B.length; i++) {
                 freqB[B[i] - 'a']++;
                
            }
            // This look could be A or B
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
        s = "welcometojava";
        int n = 3;
        int max = -1;
        int min = 200;
        int maxIndex = -1;
        int minIndex = 200;

        String[] maxString = new String[s.length()];
        String[] minString = new String[s.length()];
        System.out.println("String - the substring: " + (s.length() - n));
        System.out.println(n + " Letter;");

        for (int i = 0; i <= s.length() - n; i++) {
            System.out.println("i " + i);
            System.out.println("s charAt " + s.charAt(i));
            if (max < -1 * "A".compareTo(s.substring(i, i + 1))) {
                System.out.println(s.substring(i, i + n));
                max = -1 * "A".compareTo(s.substring(i, i + 1));
                //  System.out.println("Max " + max);
                maxIndex = i;
            }
            if (min > -1 * "A".compareTo(s.substring(i, i + 1))) {
                min = -1 * "A".compareTo(s.substring(i, i + 1));
                minIndex = i;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Word " + s.substring(maxIndex, maxIndex + n));
        System.out.println("Min: " + min);
        System.out.println("Word " + s.substring(minIndex, minIndex + n));

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
