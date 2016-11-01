/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Days_of_Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice {

    public static void main(String[] flagg) {
        getInsertFromScannerHashMap();
    }

    static void getInsertFromScannerHashMap() {
        /*
         Phone book Key value Pairs
         */
        Map<String, String> phoneBook = new HashMap<>();
        Scanner mapInput = new Scanner(System.in);

        //Adding to a list
        System.out.println("Enter the number of entries");
        int numOfpeople = mapInput.nextInt();
        do {
            System.out.println("Enter Name");
            String name = mapInput.next();
            System.out.println("Enter number");
            String number = mapInput.next();
            phoneBook.put(name, number);
            numOfpeople--;
        } while (numOfpeople > 0);
        numOfpeople++;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String names = entry.getKey();
            String numbers = entry.getValue();
            System.out.println(numOfpeople++);
            System.out.println("Name: " + names);
            System.out.println("Number: " + numbers);
        }
        System.out.println("Search Name");

        while (mapInput.hasNext()) {
            String s = mapInput.next();
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));

            } else {
                System.out.println(s + " Not found");
            }
        }

    }

    static void getHashMap() {
        /*
         Phone book Key value Pairs
         */
        Map<String, String> phoneBook = new HashMap<>();
        //Adding to a list

        phoneBook.put("Simmigon", "6787909212");

        System.out.println(phoneBook.get("Simmigon"));
        System.out.println(phoneBook.get("Denzel"));
        if (phoneBook.get("Denzel") != null) {
            System.out.println(phoneBook.get(phoneBook));
        } else {
            System.out.println("Denzel " + "Does not exist");
        }
        System.out.println("");
        //Print all keys
        System.out.println("Not Orderd\nKeys: " + phoneBook.keySet());
        //Print all values
        System.out.println("Not Orderd\nValues: " + phoneBook.values());
        //Print size
        System.out.println("Size: " + phoneBook.size());

        Map<String, Boolean> hankList = new HashMap<>();
        hankList.put("Workhard", Boolean.TRUE);
        hankList.put("Takebreaks", Boolean.TRUE);
        hankList.put("Failtest", Boolean.FALSE);
        System.out.println(hankList.get("Workhard"));
        System.out.println(hankList.get("Failtest"));
        System.out.println(hankList.get("Takebreaks"));
        System.out.println("Not Orderd\nKeys: " + hankList.keySet());
        //Print all values
        System.out.println("Not Orderd\nValues: " + hankList.values());
        //Print size    
        System.out.println("Size: " + hankList.size());
        System.out.println("Print List" + hankList.toString());

        for (Map.Entry<String, Boolean> entry : hankList.entrySet()) {
            String string = entry.getKey();
            System.out.print(string + " ");
            Boolean boolean1 = entry.getValue();
            System.out.println(boolean1 + " ");
        }
        System.out.println("\nRemove");
        //Remove
        hankList.remove("Failtest");
        for (Map.Entry<String, Boolean> entry : hankList.entrySet()) {
            String string = entry.getKey();
            System.out.print(string + " ");
            Boolean boolean1 = entry.getValue();
            System.out.println(boolean1 + " ");
        }
        System.out.println("\nNow clear list");
        //Clear list
        hankList.clear();
        System.out.println(hankList.isEmpty());
        //No replace method

    }

}
