package com.company;

public class NumberAndThings {
    public static void main (String [] args) {
        double doubly1 = Math.exp(23.98);
        double doubly2 = Math.asin(doubly1);
        double doubly3 = Math.sqrt(doubly2)*3.798;
        int num1=63;
        int num2 = num1*(int)doubly3;
        String Variables ="Practice June 15th";
        System.out.printf("%20.16 \n %8.4f \n %8.4f \n %8.4", Variables, doubly1, doubly2, doubly3);
    }
}
