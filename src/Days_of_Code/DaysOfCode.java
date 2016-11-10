package Days_of_Code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaysOfCode {

    public static void main(String[] flagg) {
        getDay20Sorting();
        
    }

    static void getDay20Sorting() {
        Scanner in = new Scanner(System.in);
        int swap = 0;
       // int n = in.nextInt();
        int a[] = {3, 2, 1};//new int[n];
//        for (int a_i = 0; a_i < n; a_i++) {
//            a[a_i] = in.nextInt();
//        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap++;
                }//end of if swap

            }//inner for loop

        }//Outer for loop
        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length -1]);

    }

    static void getDay19Interfaces() {

    }

    static void getDay18QueuesandStacks() {

    }

    static void getDay17MoreExceptions() {
        Calculator my = new Calculator();
        try {
            System.out.println(my.power(3, 3));
        } catch (Exception ex) {
            Logger.getLogger(DaysOfCode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void getDay16Exceptions_StringtoInteger() {
        // Scanner in = new Scanner(System.in);
        // String S = in.next();

        String S = "a5";

        try {
            int n = Integer.parseInt(S);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

    }

    static void getDay15LinkedList() {
        // See MyLinkedList Class and Node class
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

class Calculator {

    public int power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }//end of if        

        return (int) Math.pow(n, p);
    }//end

    class StackAndQueuePalindrome {

        Stack<Character> myStack = new Stack<>();
        //Linked list is abstract Can not Instantiate 
        Queue<Character> myQueue = new LinkedList<>();

        void pushCharacter(char ch) {
            myStack.push(ch);
        }

        void enqueueCharacter(char ch) {
            myQueue.add(ch);
        }

        char popCharacter() {
            return myStack.pop();
        }

        char dequeueCharacter() {
            return myQueue.remove();
        }
    }
}
