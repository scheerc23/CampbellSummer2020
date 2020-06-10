package com.company;

public class Challenge3 {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        char letter = 65;
        for (int i = SIZE; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= SIZE; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
        }
    }
}
