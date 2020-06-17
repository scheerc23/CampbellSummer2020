/*
Campbell Scheer
6/16/20
Psuedocode
Declare variables:
Int i = 4;
Double d = 4.0;
String s = “Greenhill”
Declare scanner
declare an integer variable num
declare a double variable count
declare a String object phrase
get value of num using the scan
get value of count using the scan
get value of String using the scan
Print new line of the sum of integers
Print new line of the sum of doubles
Print new line of the sum of strings

 */
package com.company;
import java.util.Scanner;
public class ChallengeDataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 4;
        Double count = 4.0;
        String phrase = "Greenhill";
        System.out.println("Please enter an integer: ");
        num = scan.nextInt();
        System.out.println("Please enter a double: ");
        count = scan.nextLine();
        System.out.println("Please enter an string");
        phrase = scan.nextLine();
        System.out.println ();

    }





}
