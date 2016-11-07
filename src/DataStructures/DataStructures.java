package DataStructures;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DataStructures {

    public static void main(String[] flagg) {
        String a = "daBcd";
        String b = "ABCK";
        tempAbbreviation(a, b);
    }

    static void tempAbbreviation(String a, String b) {
        String ans = "YES";
        int count = 0;
        String A = "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            A += a.substring(i, i + 1).toUpperCase();
        }

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < b.length(); j++) {        
                if (A.charAt(i) == b.charAt(j)) {
                    str.append(b.charAt(j));
                    count++;
                }
            }
        }
        if (count == b.length()) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        
        System.out.println(ans);

    }

    static void getJavaArraylist() {
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        //  Integer.MIN_VALUE
        //    aList.add(a);
        //    aList.add(b);
        aList.add(c);
        aList.add(d);
        for (int i = 0; i < 20; i++) {
            a.add(i);
            b.add(i * 2);
            c.add(i * 3);
            d.add(i * 4);
        }
        System.out.println(aList.size());
//        for (int i = 0; i < aList.size(); i++) {
//                        
//        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
            System.out.print(b.get(i) + " ");
            System.out.print(c.get(i) + " ");
            System.out.println(d.get(i) + " ");
        }

    }

    static void JavaSubArray() {
        int[] a = {1, -2, 4, -5, 1};
        int sum = 0;
        int count = 0;

        System.out.println(count);
    }

    static void TwoDArray() {
        /*Find Hour class max
         444
         050
         444
        
        
         */
        int n = 6;
        int sum = 0;
        int maxCol = Integer.MIN_VALUE;
        int maxTotal = Integer.MIN_VALUE;
        int[][] td = new int[n][n];
        Random r = new Random();
        System.out.println("" + r.nextInt(100));
        for (int i = 0; i < td[0].length; i++) {
            for (int j = 0; j < td.length; j++) {
                td[i][j] = r.nextInt(5);
            }
        }

        for (int i = 0; i < td[0].length; i++) {
            for (int j = 0; j < td.length; j++) {
                System.out.print(td[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
//                System.out.print(td[i][j] + " ");
//                System.out.print(td[i][j + 1] + " ");
//                System.out.print(td[i][j + 2] + " \n");
//                System.out.println("0 " + td[i + 1][j + 1] + " 0");
//
//                System.out.print(td[i + 2][j] + " ");
//                System.out.print(td[i + 2][j + 1] + " ");
//                System.out.println(td[i + 2][j + 2] + " ");
                sum += td[i][j] + td[i][j + 1] + td[i][j + 2];
                sum += td[i + 1][j + 1];
                sum += td[i + 2][j] + td[i + 2][j + 1] + td[i + 2][j + 2];
                System.out.println("Sum: " + sum);
                if (maxCol < sum) {
                    maxCol = sum;
                    //   System.out.println("lololo " + maxCol);
                }

                sum = 0;
            }

            if (maxTotal < maxCol) {
                maxTotal = maxCol;
            }

        }
        System.out.println(maxTotal);

    }

    static void LeftRotation() {

        Scanner in = new Scanner(System.in);
        System.out.println("how many number");
        int n = in.nextInt();
        System.out.println("how many moves");
        int k = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            //      System.out.println("enter " + (n - i) + " numbers");
            a[i] = in.nextInt();
        }
//        for (int i = 0; i < n; i++) {            
//            System.out.println(a[i]);
//        }

        System.out.println();
        int t[] = new int[k];

        //step 1: Copy to temp
        for (int i = 0; i < k; i++) {
            t[i] = a[i];

        }
        //step 2: Make room in array
        for (int i = 0; i < a.length - t.length; i++) {
            a[i] = a[i + t.length];

        }
        //step 3: Add to end
        for (int i = 0; i < k; i++) {
            a[a.length - t.length + i] = t[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void SparseArrays() {
        /*
         There are N strings. Each string's length is no more than 20 characters. There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

         Input Format

         The first line contains N, the number of strings.
         The next N lines each contain a string.
         The N + 2nd line contains , Q the number of queries.
         The following Q lines each contain a query string.
         */

    }
}
