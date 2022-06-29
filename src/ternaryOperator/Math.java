package ternaryOperator;

import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter first Number: ");
    boolean firstInteger = input.nextBoolean();

        String  result = (firstInteger = true) ? "Correct" : "Wrong";
        System.out.println("You Entered the " + result + " the number.");
    }
}
