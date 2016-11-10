package DataStructures;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        SparseArrays();
    }

    static void SparseArrays() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");

        int n = in.nextInt();

        String[] nstrs = new String[n];
        for (int i = 0; i < nstrs.length; i++) {
          //  System.out.println("Enter String");
            nstrs[i] = in.next();

        }
//        for (int i = 0; i < nstrs.length; i++) {
//            System.out.print(nstrs[i] + " ");
//        }
       // System.out.println("Enter Q");
        int q = in.nextInt();
        String[] qstrs = new String[q];

        for (int i = 0; i < qstrs.length; i++) {
       //     System.out.println("Enter String");
            qstrs[i] = in.next();

        }
//        for (int i = 0; i < qstrs.length; i++) {
//            System.out.print(qstrs[i] + " ");
//        }
//        System.out.println("");
        
        for (int i = 0; i < qstrs.length; i++) {
            int count = 0;
            for (int j = 0; j < nstrs.length; j++) {
                if (nstrs[j].equals(qstrs[i])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
