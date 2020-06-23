/*
// Campbell Scheer
// 6/23/20
// Import java.util*
// Create a public static void main
// Define 2 randoms (one with range 5-10, two with range 1-100)
// Make a new array
// Create a for loop that repeats as many times equal to the length of the first array
// Print the final value
// Create two index values (1)
// Create two index values (2)
// Size makes sure that the number stays in range
// This makes it so that the two indexes aren't equal to each other
// Create public static int swap
// Return the flipped value
 */

package com.company;
import java.util.*; // Import java.util*
public class SwapClassWork {
    public static void main(String [] args){ // Create a public static void main
        Random rand = new Random(); // Define 2 randoms (one with range 5-10, two with range 1-100)
        int timy = rand.nextInt(5)+5; // Make a new array
        int[] myarray = new int[timy];
        for (int i = 0; i < myarray.length; i++){ // Create a for loop that repeats as many times equal to the length of the first array
            myarray[i] = (rand.nextInt(95) + 5);
        }
        System.out.println(Arrays.toString(myarray)); // Print the final value
        int index1; // Create two index values (1)
        int index2; // Create two index values (2)
        do {
            index1 = rand.nextInt(timy); // Size makes sure that the number stays in range
            index2 = rand.nextInt(timy);
        } while (index1 == index2); // This makes it so that the two indexes aren't equal to each other

        swap(myarray,index1, index2);
        System.out.println(Arrays.toString(myarray));
    }
    public static int[] swap(int[] A, int i, int i1) { // Create public static int swap
        int temp = A[i];
        A[i] = A[i1];
        A[i1] = temp;
        return A; // Return the flipped value
    }
}

