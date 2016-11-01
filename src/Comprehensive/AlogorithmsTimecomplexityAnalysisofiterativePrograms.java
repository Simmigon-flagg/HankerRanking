package Comprehensive;

public class AlogorithmsTimecomplexityAnalysisofiterativePrograms {

    public static void main(String[] flagg) {
        flagg4();
    }

    //O(n)
    static void flagg() {

        int a;
        for (int i = 0; i < 10; i++) {
            System.out.println("Flagg"); // n 
        }
    }

    //O(n^2)
    static void flagg1() {

        int a;
        int b;
        for (int i = 0; i < 10; i++) { // n times
            for (int j = 0; j < 10; j++) { // n times
                System.out.println("Flagg"); // n^2 n squared times
            }
        }
    }

    //O(n^2)
    static void flagg2() {

        int i = 1;
        int s = 1;
        int n = 20;
        while (s <= n) {
            System.out.print("When i is " + i + " s is " + s + " ");
            i++; //linear
            s = s + i; //k(k+1)/2
            // when this loop stop k(k + 1)/ 2 > n 
            // k^2 + k / 2; k == O(root n)
            //What is the value of 
            //n after k iteration
            //at each lineat iteration s is the
            //sum of all i values. which are linear
        }
        System.out.println("");
    }

    static void flagg3() {

        int n = 30;
        for (int i = 1; i * 2 <= n; i++) {

            System.out.print(i + " squared ");
        }
        System.out.print("Root n times O(root n)");

    }

    static void flagg4() {
        /* Runtime  
         = 1 * 100 + 2 * 100 + 3 * 100 + ... + n * 100
         = 100(1 + 2 + 3 + ... n)
         = 100(n(n + 2)/2)
         = O(n^2)
        
         */
        int kTimes = 1;
        int n = 30;
        for (int i = 1; i <= n; i++) {

            System.out.println("i = " + i + " times ");
            for (int j = i; j <= i; j++) {

                System.out.println("j = " + j + " times");
                for (int k = 1; k <= 100; k++) { // this line is independeat so consatance                    
                }
                System.out.println("k ran " + kTimes++ + " * 100 times ");
            }
        }
    }

    static void flagg5() {
        /*
         When ever there is a dependacny you have to 
         unroll the loop to find the complexiy                
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i + " times");
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j + " times");
                for (int k = 0; k < 10; k++) {
                    System.out.println("k = " + k + " times");
                }
            }
        }
    }
}
