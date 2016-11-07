package Days_of_Code;

import java.util.Scanner;

public class DaysOfCode {

    public static void main(String[] flagg) {

    }

    static void getDay15LinkedList() {
        
    }

    static void getDay_7() {
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

    static void getDay10BinaryNumbers() {
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

    static void getDay12In() {
        class Student {

            private int[] testScores;
//
//            public Student(String firstName, String lastNAme, int id, int[] scores) {
//                this.firstName = firstName;
//                this.LastName = lastName;
//                this.id = id;
//                this.scores = scores;
//
//            }

        }

    }

}

class Person {

    protected String firstName;
    protected String lastName;
    protected int identification;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identification = identification;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", identification=" + identification + '}';
    }
}

class Student extends Person {

    public Student(String firstName, String lastName, int identification) {
        super(firstName, lastName, identification);
    }

}
