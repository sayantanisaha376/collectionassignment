//create a list of 5 strings and print them using lambda

package com.example;

import java.util.ArrayList; // Importing ArrayList class.
import java.util.List;      // Importing List interface.


// This class demonstrates the usage of a lambda expression to display strings
// from a list using the forEach method.

public class StringDisplayUsingLambda {

    public static void display(List<String> list){
        // Using lambda expression to iterate and print each string.
        list.forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        // Creating a list of strings and adding elements to it.
        List<String> ls = new ArrayList<>();
        ls.add("My");
        ls.add("Name");
        ls.add("Is");
        ls.add("Sayantani");
        ls.add("Saha");

        // Calling the display method to print each string in the list.
        display(ls);
    }
}
