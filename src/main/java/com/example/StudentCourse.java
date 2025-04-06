//create a Student class with name and degree then create a list of 5 students
//   then print only those who read in btech course.
package com.example;

import java.util.ArrayList;
import java.util.List;  // Import statements for using List and ArrayList

// Class representing a student with a name and their enrolled course
public class StudentCourse {
    public String name;  // Variable to store the student's name
    public String course;  // Variable to store the student's course

    // Constructor to initialize student details
    public StudentCourse(String name, String course) {
        this.name = name;
        this.course = course;
    }

    // Getter method to retrieve the course of the student
    public String getCourse() {
        return course;
    }

    // Getter method to retrieve the name of the student
    public String getName() {
        return name;
    }

    // Static method to filter and print names of students enrolled in Btech
    public static void PrintOnlyBtechStudentNames(List<StudentCourse> stu) {
        List<String> btechStudents = new ArrayList<>();  // List to store Btech students' names

        // Iterate through the list and check if the student is enrolled in Btech
        for (StudentCourse studentCourse : stu) {
            if(studentCourse.getCourse().equals("Btech")) {
                btechStudents.add(studentCourse.getName());  // Add Btech student names to list
            }
        }

        // Print the names of students enrolled in Btech
        for (String name : btechStudents) {
            System.out.println(name);
        }
    }

    // Main method to create students, add them to a list, and invoke filtering
    public static void main(String[] args) {
        List<StudentCourse> stu = new ArrayList<>();  // Create a list of students

        // Adding student objects with names and courses
        stu.add(new StudentCourse("Sayantani", "Btech"));
        stu.add(new StudentCourse("Souparno", "BCA"));
        stu.add(new StudentCourse("Tamojit", "Btech"));
        stu.add(new StudentCourse("Aditya", "BCA"));
        stu.add(new StudentCourse("Trisha", "Btech"));

        // Calling the method to filter and print Btech student names
        PrintOnlyBtechStudentNames(stu);
    }
}
