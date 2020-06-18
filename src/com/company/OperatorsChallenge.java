/*
6/18/20
Campbell Scheer
Create java for scanner
Declare scanner
Declare variable int
Declare variable int
Declare variable double
Create a println that asks for preferred variables
Create calculations for tip and tax
Find final total of meal, tax, and tip
 */

package com.company;

import java.util.Scanner;

public class OperatorsChallenge {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your meal cost:");
        double mealcost = console.nextDouble();
        System.out.println("Enter your tip percent:");
        int tippercent = console.nextInt();
        System.out.println("Enter your tax percent:");
        int taxpercent = console.nextInt();
        solve(mealcost, tippercent, taxpercent);
        
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * (tip_percent / 100.00);
        double tax = meal_cost * (tax_percent / 100.00);
        long totalcost = Math.round(meal_cost + tip + tax);
        System.out.println(totalcost);
    }
}
