/*
// Campbell Scheer
// 6/22
// Make a public static void main and Define the int "M"
// Define int M
// Create a string for the input array
// Create a string for the output array
// Create a string for the words
// Create a do while loop which makes it so that you can only continue if the user enters a valid number of words
// Ask how many words the person is going to enter
// Create a scanner that allows user to answer the question
// Create a while loop to set the valid range of numbers
// Create a for loop that repeats until the amount entered
// Ask the person to input the word
// Create a while loop for range of valid numbers
// Set output equal to actual method
// Create a for loop
// Create a public static Spring scramble which is the return method
// Create a string for odd
// Create a string for even
// Create a loop that picks out the even letters
// Create a loop that picks out the odd letters
// return newEvenWord + " " + newOddWord
 */

package com.company;
import java.util.Scanner;
public class ArrayStringChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Make a public static void main
        int M; // Define int M
        String word; //Create a string for the words
        do { // Create a do while loop which makes it so that you can only continue if the user enters a valid number of words
            System.out.println("How many words between 1-10 would you like to enter?"); // Ask how many words the person is going to enter
            M = input.nextInt(); // Create a scanner that allows user to answer the question
        } while ( M < 1 || M > 10); // Create a while loop to set the valid range of numbers
        String[] inWord = new String[M]; // Create a string for the input array
        String[] outWord = new String [M]; // Create a string for the output array
        for (int i = 0; i < M; i++) { // Create a for loop that repeats until the amount entered

            do { // Create a do bracket
                System.out.println("Can you enter the word?"); //Ask the person to input the word
                word = input.next();
                inWord[i] = word;
            } while (word.length() < 2 || word.length() > 10000); // Create a while loop for range of valid numbers
            outWord[i] = scramble(inWord[i]); // Set output equal to actual method
        }
        for (int i=0; i <M; i++) { // Create a for loop
            System.out.println(outWord[i]);
        }

    }

    public static String scramble(String word) { // Create a public static Spring scramble which is the return method
        String newOddWord = ""; // Create a string for odd
        String newEvenWord = ""; // Create a string for even
        for (int even = 0; even < word.length(); even += 2) { // Create a loop that picks out the even letters
            char letter = word.charAt(even);
            newEvenWord = newEvenWord + letter;
        }
        for (int odd = 1; odd < word.length(); odd += 2) { // Create a loop that picks out the odd letters
            char letter = word.charAt(odd);
            newOddWord = newOddWord + letter;
        }
        return newEvenWord + " " + newOddWord; // return newEvenWord + " " + newOddWord
    }
}
