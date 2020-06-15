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

