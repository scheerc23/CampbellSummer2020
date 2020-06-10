package com.company;

public class ActualChallenge2 {

    public static int Size = 5;

    public static void main(String[] args) {

        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();

    }

    public static void Top() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -1 * line + Size; spaces++)
                System.out.print(" ");
        }

        for (int dots = 1; dots <= line - 1; dots++) {
            System.out.print("/");
        }
        System.out.print("*");
        for (int dots = 1; dots <= line - 1; dots++) {
            System.out.print("\\");
        }

        for (int spaces = 1; spaces <= -1 * line + Size; spaces++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
        public static void Line () {
            System.out.print("+");
            for (int dash = 0; dash <= 7 + Size * Size; dash++) {
                System.out.print("-")
            }
            System.out.println("+");
        }

        public static void Bottom () {
            for (int line = 1; line < 4 + Size; line++) {
                System.out.print("|");
                for (int spaces = 1; spaces <= 1 * line -1 + Size; spaces++) {
                    System.out.print(" ");
                }

            for (int dots = 1; dots <= -1 * line + 3 + Size; dots++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int dots = 1; dots <= -1 * line + 3 + Size; dots++) {
                System.out.print("/");
            }

            for (int spaces = 1; spaces <= 1 * line -1 + Size; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}