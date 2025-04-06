// create a list of 5 strings and print them using for each loop


package com.example;

import java.util.ArrayList;
import java.util.List;  // Imports necessary classes for using List and ArrayList

public class PrintString {  // Defines a class named PrintString
    // Static method to iterate over a list of strings and print each string
    public static void print(List<String> ls){
        for (String s : ls) {  // Iterates over the list and prints each string
            System.out.println(s);
        }
    }

    public static void main(String[] args) {  // Main method, entry point of the program
        List<String> ls = new ArrayList<>();  // Creates a list of strings and initializes it with ArrayList
        ls.add("My");  // Adds elements to the list
        ls.add("College");
        ls.add("Is");
        ls.add("Amity");
        ls.add("University");

        print(ls);  // Calls the method to print the elements of the list
    }
}
