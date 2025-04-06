//create a list of 5 strings and print that string having length > 3 characters

package com.example;

import java.util.ArrayList;
import java.util.List;  // Imports required classes for List and ArrayList

public class StringLengthmorethan3 {  // Class to filter and print strings with length > 3

    // Method to iterate through the list and print strings longer than 3 characters
    public static void LengthofString(List<String> lst) {
        for (String s : lst) {  // Iterates over the list
            if (s.length() > 3) {  // Checks if the string length is greater than 3
                System.out.println(s);  // Prints the string if condition is met
            }
        }
    }

    public static void main(String[] args) {  // Main method, entry point of the program
        List<String> lst = new ArrayList<>();  // Creates a list of strings and initializes it

        // Adding elements to the list
        lst.add("My");
        lst.add("Name");
        lst.add("Is");
        lst.add("Sayantani");
        lst.add("Saha");

        LengthofString(lst);  // Calls the method to filter and print the strings
    }
}
