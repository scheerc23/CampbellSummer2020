package com.company;

public class Challenge2 {

    public static void main(String[] args) { //main method// call all my functions

        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line() {
        System.out.print("#");
        //define the var   control   increment
        //initialize it    value     by 1
        for (int dash = 0; dash < 16; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top() {
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }


    public static void Bottom() {
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}
