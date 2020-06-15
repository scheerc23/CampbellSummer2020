package com.company;

public class StringExamples {
    public static void main(String[] args) {
        sayHI("Marty");
        String name = "8";
        sayHI(name);
        String teacher = "Maria Suarez";
        System.out.println(teacher.substring(3, 7));
        sayHI(teacher);
        Challenge2.Line();
    }
    public static void sayHI(String name) {
        System.out.println("This name is " + name.length() + "characters long");
        System.out.println("Hello " + name);
        int indexOf = name.indexOf("S");
        System.out.println("The index of S is = " + indexOf);
        if (indexOf > 0) {
            String lastName = name.substring(indexOf);
            System.out.println("The lastName = " + lastName);
        }
        if(name.length() > 4) {
            char letter;
            letter= name.charAt(4);
            System.out.println("The character = "+ letter);

        }
    }
}
