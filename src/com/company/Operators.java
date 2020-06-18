package com.company;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your weight in pounds?");
        double weight = input.nextDouble();

        System.out.println("What is your height in inches?");
        double height = input.nextDouble();

        System.out.println("Your BMI is: " +BMI);
        double BMI = weight/Math.pow(height,2) *703;

        System.out.println("What is your friends height in inches?");
        double height2 = input.nextDouble();

        System.out.println("What is your friends weight in pounds?");
        double weight2 = input.nextDouble();

        double BMI2 = weight2/Math.pow(height2,2) *703;
        System.out.println("Your friend's BMI is': " +BMI2);

        if (BMI2 <=18.5) {
            System.out.println("Your friend is underweight");
        }
        else if (BMI <=18.5) {
            System.out.println("Your friend is normal");

        }
        else if (BMI2 <30.0) {
            System.out.println("Your friend is overweight");

        }
        else if (BMI2 >=30.0) {
            System.out.println("Your friend is obese");
        }
        double difference = (BMI - BMI2);
        System.out.println("The BMI difference between you and your friend is: " +difference);
    }
}
