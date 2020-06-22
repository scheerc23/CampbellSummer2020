/*
Campbell Scheer
6/21
Import scanner
Make a public static void main and Define the int "M"
Create a do bracket
Ask how many words the person is going to enter
Create a while loop
Create a for loop
Create a do bracket
Ask the person to enter the word
Create a while loop
Create a public static Spring scramble which is the return method
Create a string for odd
Create a string for even
Create a loop that picks out the even letters
Create a loop that picks out the odd letters
return newEvenWord + " " + newOddWord
Goal: break up each word into even and odd letters
 */
package com.company;
import java.util.Scanner;
public class SecondStringChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Make a public static void main and Define the int "M"
        int M; // Define int M
        String word;
        do { // Create a do bracket
            System.out.println("How many words between 1-10 would you like to enter?"); //Ask how many words the person is going to enter
            M = input.nextInt();
        } while ( M < 1 || M > 10); // Create a while loop
        for (int i = 1; i < M; i++) { // Create a for loop
            do { // Create a do bracket
                System.out.println("Can you enter the word?"); //Ask the person to enter the word
                word = input.next();
            } while (word.length() < 2 || word.length() > 10000); // Create a while loop
            String dividedWord = scramble(word);
            System.out.println(dividedWord);

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
