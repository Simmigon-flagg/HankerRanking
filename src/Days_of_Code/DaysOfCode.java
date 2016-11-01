
package Days_of_Code;

import java.util.Scanner;

public class DaysOfCode {

    public static void main(String[] flagg) {
        day10BinaryNumbers();
    }

    static void day_7() {
        //print array backwards
        // Scanner in = new Scanner(System.in);
        // int n =in.nextInt();
        int[] arr = {6, 7, 8, 9, 0};//new int[5];

//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    static void day10BinaryNumbers() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int consecutiveOnes = -1;
        while (n > 0) {
            int r = n % 2;
            //Remove last digit
            n /= 2;
            if (r == 1) {
                count++;
                if (count > consecutiveOnes) {
                    consecutiveOnes = count;

                }
            } else {
                count = 0;
            }

        }//end of while loop
        System.out.println(consecutiveOnes);
    }
    static void day19Interfaces() {
        
    
    }
}
