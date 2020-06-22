/*
Campbell Scheer
6/22
Create a scanner
Initialize the variable "days"
Create a double for the variable "sum"
Initialize the variable "count"
Create a do bracket
Ask the user how many days they want to use by printing the question
Create a while loop and use an or statement
Set up a random number variable (between 25 and 110) to 85+25
Create a loop that repeats a certain amount of times depending on the user's input value
Create a double that makes it so all of the output values get added up and then divided but the input value to determine the average
 */

package com.company;

import java.util.*;
public class WeatherQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a scanner
        int days = 0; // Initialize the variable "days"
        Random randy = new Random();
        double sum = 0.0; // Create a double for the variable "sum"
        int count = 0; // Initialize the variable "count"
        do { // Create a do bracket
            System.out.println("How many days' temperatures between 2 and 100 would you like to use?"); // Ask the user how many days they want to use by printing the question
            days = input.nextInt();
        } while (days > 100 || days < 2); // Create a while loop and use an or statement
        int[] myArray = new int[days];

        for (int i = 0; i < days; i++) { // Create a loop that repeats a certain amount of times depending on the user's input value
            myArray[i] = randy.nextInt(85) +25; // Set up a random number variable (between 25 and 110) to 85+25
            System.out.println("Day "+ (i+1) +" temperature " + myArray[i]);
            sum = sum + myArray[i];
        }
        double average = sum / days; // Create a double that makes it so all of the output values get added up and then divided but the input value to determine the average
        System.out.println("Average temp = "+average);

        for (int i = 0; i < days; i++) {
            if(myArray[i] > average) {
                count++;
            }
        }
    }
}
