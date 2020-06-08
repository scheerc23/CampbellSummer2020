package com.company;

public class ActualChallenge2{
public static void main(String[] args) {

    Line();
    Top();
    Line();
    //Bottom();
    Line();

}
        public static void Line (){
            System.out.print("+");
            for(int dash=0;dash< 9;dash++) {
                System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Top (){
        for (int line = 2; line <6; line ++) {
            System.out.print("|");

            for (int space = 1; space <= -1 * line + 6; space++) {
                System.out.print("");
            }
            for (int forwardslash = 1; fowardslash < line - 1; forwardslash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 1; backslash < line - 1; backslash++) {

                System.out.print("\\");
            }
            for (int space = 1; space <= -1 * line + 6; space++) System.out.print(""); {}