/*
Campbell Scheer
6/21
Import scanner
Define int M
Ask how many words the person is going to enter
Ask the person to enter the word
Create a string for odd
Create a string for even
 */
package com.company;
import java.util.Scanner;
public class SecondStringChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Import scanner
        int M; // Define int M
        String word;
        do {
            System.out.println("How many words between 1-10 would you like to enter?"); //Ask how many words the person is going to enter
            M = input.nextInt();
        } while ( M < 1 || M > 10);
        for (int i = 1; i < M; i++) {
            do {
                System.out.println("Can you enter the word?"); //Ask the person to enter the word
                word = input.next();
            } while (word.length() < 2 || word.length() > 10000);
            String dividedWord = scramble(word);
            System.out.println(dividedWord);

        }

    }

    public static String scramble(String word) {
        String newOddWord = ""; // Create a string for odd
        String newEvenWord = ""; // Create a string for even
        for (int even = 0; even < word.length(); even += 2) {
            char letter = word.charAt(even);
            newEvenWord = newEvenWord + letter;
        }
        for (int odd = 1; odd < word.length(); odd += 2) {
            char letter = word.charAt(odd);
            newOddWord = newOddWord + letter;
        }
        return newEvenWord + " " + newOddWord;
    }
}
