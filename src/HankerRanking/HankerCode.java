/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HankerRanking;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Locale;
import java.util.Scanner;

public class HankerCode {
//
//    /**
//     * @param args the command line arguments
//     */

    public static void main(String[] args) {

        getAreaofTriangles();
    }

    static void getAreaofTriangles() {
        Scanner in = new Scanner(System.in);
     //  int n = in.nextInt();
        int[][] a = {{1, 1, 5, 1, 3, 3}, {1, 2, 5, 2, 5, 6}, {1, 6, 5, 2, 1, 2}};
        int d = 3;
        int[][] data = new int[d][6];
        System.out.println("a.length " + a.length);
        System.out.println("a[0].length " + a[0].length);
        double sumi = 0.0;
        double sumj = 0.0;
        double sumk = 0.0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = j;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.println(data[i][j]);
            }
        }

        double groupSum = 0.0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sumi = a[j][2] * a[j][5] - a[j][3] * a[j][4];
                //a[0][0] * a[0][4] + " - " + a[0][1] * a[0][5] + " = " + 
                sumj = a[j][0] * a[j][4] - a[j][1] * a[j][5];
                //a[0][0] * a[0][2] + " - " + a[0][1] * a[0][3] + " = " + 
                sumk = a[j][0] * a[j][2] - a[j][1] * a[j][3];

                groupSum += (sumi + sumj + sumk) / 2.0;

            }
     
            sumi = 0;
            sumj = 0;
            sumk = 0;
        }
        System.out.println(groupSum/ 2.0);

    }

    static void getIntroductionChallenges() {

    }

    static void gethowToStringToCompareTo() {
        String s = "adcABC";
        String f = "";
        int min = 100;
        int max = -1;

        //    System.out.println("Large A = "+ "A".compareTo("A"));
        // System.out.println("Small A = " + "A".compareTo("a"));
        for (int i = 0; i < s.length(); i++) {
            // System.out.print((int) s.charAt(i) + " ");
            // A = 0 amd lowercase z = 57
            //    System.out.print("[" + s.substring(i, i + 1) + "] ");
            //      System.out.print("[" + -1 * "A".compareTo(s.substring(i, i + 1)) + "] ");
            if (i % 10 == 0) {
                System.out.println("");
            }

            if (min > -1 * "A".compareTo(s.substring(i, i + 1))) {
                f = "";
                // System.out.println(s.substring(i, i + 1));
                f = s.substring(i, i + 1);
                min = -1 * "A".compareTo(s.substring(i, i + 1));
            }

        }
        System.out.println(f);

    }

    static void getFindMinAndMax() {
        int max = -200;
        int min = 200;
        for (int i = 0; i < 10; i++) {
            //System.out.println("Max " + max + " Min " + min);
            if (max < i) {
                max = i;

            }
            if (min > i) {
                min = i;

            }

        }
        System.out.println("\nMax " + max + " Min " + min);
    }

    static void getFindMiddleFormUnKnownListSize() {
        int[] n = {1, 2, 3, 4, 2, 3, 4};

        int middle = (n.length % 2 == 0)
                ? (n.length / 2)
                : (n.length / 2 + 1) - 1;

        //This way I can test two indexes with one loop
        for (int i = 0; i < middle; i++) {
            System.out.println("index = (" + i + ") \tmiddle(" + (middle + i) + ") ");

        }
        System.out.println("");
    }

    static void getJavaCurrencyFormatter() {
        double n = 12324.134;
        Locale uslocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale inlocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale chlocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale frlocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        NumberFormat us = NumberFormat.getCurrencyInstance(uslocale);
        NumberFormat in = NumberFormat.getCurrencyInstance(inlocale);
        NumberFormat ch = NumberFormat.getCurrencyInstance(chlocale);
        NumberFormat fr = NumberFormat.getCurrencyInstance(frlocale);
        System.out.println("" + us.format(n));
        System.out.println("" + in.format(n));
        System.out.println("" + ch.format(n));
        System.out.println("" + fr.format(n));
    }

    static String[] getPalindromic_Border(String[] a, int shift) {

//          Copy to main class to use this method        
//         for (int i = 0; i < 8; i++) {
//            String[] a = {"a", "b", "c","d","e","f","g","h"};
//            String[] temp = getPalindromic_Border(a, i);
//            for (int j = 0; j < temp.length; j++) {
//                System.out.print(temp[j]+ " " );                
//            }
//            System.out.println("");
//        }
        // using left shift roration to start
        //getArrays_Left_Rotation
        //Left Shift of integers in an array
        String[] t = new String[shift];

        //System.out.println("step 1: Copy to temp");
        for (int i = 0; i < shift; i++) {
            t[i] = a[i];
        }

        // System.out.println("step 2: Make room array");
        for (int i = 0; i < a.length - shift; i++) {
            a[i] = a[i + shift];
        }

        // System.out.println("step 3: Add to end");
        for (int i = 0; i < shift; i++) {
            a[a.length - shift + i] = t[i];
        }

        //  System.out.println("step 4: Print");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("[" + i + "] = {" + a[i] + "}, ");
//        }
        //System.out.println("");
        return a;
    }

    static void getCompareTriples() {
        int a0 = 5;
        int a1 = 6;
        int a2 = 7;
        int b0 = 3;
        int b1 = 6;
        int b2 = 10;
        int sumA = 0;
        int sumB = 0;
        if (a0 != b0) {
            if (a0 > b0) {
                sumA++;
                System.out.println("sumA " + sumA);
            } else {
                sumB++;
            }
        }

        if (a1 != b1) {
            if (a1 > b1) {
                sumA++;
            } else {
                sumB++;
            }
        }
        if (a2 != b2) {
            if (a2 > b2) {
                sumA++;
            } else {
                sumB++;
                System.out.println("sumB " + sumB);
            }
        }
        System.out.println(sumA + " " + sumB);
    }

    static int[] getArrays_Left_Rotation() {
        //Left Shift of integers in an array
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int k = 3;
        int[] a = new int[n];

        int t[] = new int[k];
        System.out.println("Fill the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println("step 1: Copy to temp");
        for (int i = 0; i < k; i++) {
            t[i] = a[i];
            System.out.println("t[" + i + "] = " + t[i]);
        }

        System.out.println("step 2: Make room array");
        for (int i = 0; i < a.length - t.length; i++) {
            a[i] = a[i + t.length];
            System.out.println("a[" + i + "] = " + a[i]);

        }

        System.out.println("step 3: Add to end");
        for (int i = 0; i < k; i++) {
            a[a.length - t.length + i] = t[i];
            int c = t.length + i + 1;
            System.out.println("a[" + a.length + " - " + t.length + " - " + i + "] = t[" + i + "] ");

        }

        System.out.println("step 4: Print");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        return a;
    }

    static void getArithmetic() {

        // Scanner scan = new Scanner(System.in);
        double mealCost = 12.00; // original meal price
        int tipPercent = 20; // tip percentage
        int taxPercent = 8; // tax percentage
        //  scan.close();

        // Write your calculation code here.
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        System.out.println("meal " + mealCost + " tip " + tip + " tax " + tax);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

    static void getFindMiddle() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " " + ((i / 2) + 1) + "\t");
            if (i % 10 == 0) {
                System.out.println("");
            }

        }
    }

    static boolean[] getSearchingFromBothEndsAlgo() {
        //Simmigon Flagg
        boolean[] matches = {true, true};
        String[] a = {"a", "b", "c", "Stop", "Stop", "c", "b", "a"};
        String[] b = {"a", "b", "b", "Stop", "Stop", "b", "a", "i"};

        String ans = "";
        System.out.println("A: ");
        for (int i = 0; i <= a.length / 2; i++) {
            if (a[i].equals(a[a.length - i - 1])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                break;

            }

        }
        System.out.println("B: ");
        for (int i = 0; i <= b.length / 2; i++) {
            if (b[i].equals(b[b.length - i - 1])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                break;
            }

        }

        System.out.println("A: ");
        System.out.println();
        for (int i = 0; i <= a.length / 2; i++) {
            if (!a[i].equals(a[a.length - i - 1])) {
                matches[0] = false;
            }

        }

        System.out.println("B: ");
        System.out.println();
        for (int i = 0; i <= b.length / 2; i++) {
            if (!b[i].equals(b[b.length - i - 1])) {
                matches[1] = false;
            }

        }

        System.out.println(ans);
        return matches;
    }

    static void getNCRTest_Question() {
        String[] testCase = {"{", "[", "(", ")", "]", "}"};
        String ans = "";

        //return Yes if left has a matching right
        if (testCase.length % 2 == 0) {
            for (int i = 0; i <= testCase.length; i++) {
                // to count down from right use length - ith place in
                // the loop - 1.
                // this will always work when searching
                if (testCase[i] != testCase[testCase.length - i - 1]) {
                    System.out.print("testCase[i]  = " + testCase[i]);
                    System.out.println(" : testCase[testCase.length - i - 1] = " + testCase[testCase.length - i - 1]);
                    ans = "Yes";
                    // to find the half way stopping point use
                    // i + 1 >= array.length / 2
                    System.out.println("i + 1 = " + (i + 1));
                    if (i + 1 >= testCase.length / 2) {
                        break;
                    }
                } else {
                    System.out.print(testCase[i]);
                    System.out.println(" The end" + testCase[testCase.length - i - 1]);
                    ans = "no";
                    break;
                }
            }

        } else {
            ans = "no";
        }
        System.out.println(ans);
    }

    static void getDayString() {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar cal = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        int result = cal.get(Calendar.DAY_OF_WEEK);
        String[] DAY = {"WEEK DAY NAMES", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println(DAY[result]);
    }

    static void readinglines() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        String s = scan.next();

        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    static void Day_3_Intro_to_Conditional_Statements() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {

            if (n <= 2 && n >= 5) {
                ans = "Not Weird";

            } else if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }

}
