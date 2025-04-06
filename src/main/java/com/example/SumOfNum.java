//Create an array of 5 integers then store them in a list then write a static method
//   which will take a list as parameter and find the sum of the numbers.

package com.example;
import java.util.ArrayList;
import java.util.List;  // Importing necessary classes for List and ArrayList

// Class to calculate the sum of an array of numbers
public class SumOfNum {

    // Method to convert an array of numbers into a list and calculate their sum
    public static void print() {
        int[] num = {25, 77, 86, 93, 521};  // Array containing numbers
        List<Integer> numList = new ArrayList<>();  // List to store numbers

        // Loop to add elements from the array to the list
        for(int number : num) {
            numList.add(number);
        }

        // Calculate sum using the helper method
        int sum = calculateSum(numList);

        // Print the total sum
        System.out.println("Sum of numbers is :  " + sum);
    }

    // Method to calculate the sum of all numbers in the list
    public static int calculateSum(List<Integer> numList) {
        int sum = 0;

        // Iterating over the list and summing up the numbers
        for(int number : numList) {
            sum += number;
        }

        return sum;  // Returning the computed sum
    }

    // Main method, entry point of the program
    public static void main(String[] args) {
        print();  // Calls the print method to execute sum calculation
    }
}
