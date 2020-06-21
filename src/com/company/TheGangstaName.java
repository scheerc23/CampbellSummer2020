/*
Campbell Scheer
Write a program that outputs a person's "gangsta name."
–first initial
–Diddy
–last name (all caps)
–first name
–-izzle
psuedocode:
Create a scanner
Create a string that prints out a space to type in your name
Create a string first initial to go before Diddy
Create a string that prints the first
Set last name equal to the upper case version of it so the last name will be all upper case
Create a string name that combines the string first name and string last name
Create a print line that announces the ending gangsta name
 */
package com.company;
import java.util.*;

public class TheGangstaName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name, playa: ");
        System.out.print("Campbell Scheer");
        String name = sc.nextLine();
        sayHi(name);
        System.out.println("#============#");
    }
    public static void sayHi(String name) {
        char firstInitial= name.charAt(0);
        int indexOf = name.indexOf(" ");
        String firstName = name.substring(0, indexOf);
        String lastName = name.substring(indexOf+1);
        lastName = lastName.toUpperCase();
        String gangsta = firstInitial+".Diddy "+ lastName + " " + firstName + "-izzle";
        System.out.println("Your gangsta name is \"" + gangsta +"\"");
    }
}

