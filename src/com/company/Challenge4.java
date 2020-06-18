package com.company;

public class Challenge4 {

    public static void main(String[] args) {
        int bill1 = 38;
        int bill2 = 40;
        int bill3 = 30;
        int subtotal = bill1 + bill2 + bill3;
        double tipPercent = 0.08;
        double taxPercent = 0.15;
        double taxes = subtotal * taxPercent;
        double tip = subtotal * tipPercent;
        double total = subtotal + taxes + tip;

        System.out.println("Your subtotal is: " + subtotal);
        System.out.println("Your tax is: " + taxes);
        System.out.println("Your tip is: " + tip);
        System.out.println("Your total is:");
        System.out.print(subtotal + taxes + tip);
    }
}


