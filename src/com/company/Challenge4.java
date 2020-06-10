package com.company;

public class Challenge4 {
    public static final double tax = 0.8;
    public static void main(String[] args) { //main
        //call all my functions
        int bill1 = 38;
        int bill2 = 40;
        int bill3 = 30;

    }

    // Calculate total owed, assuming 8% tax / 15% tip
    public static void subtotal() {
        System.out.print("bill1+bill2+bill3");
    }

    public static void tax() {
        System.out.print("subtotal*tax");
    }

    public static void tip() {
        System.out.print("subtotal*0.15");
    }

    public static void total() {
        System.out.print("subtotal+tip+tax");
    }

}