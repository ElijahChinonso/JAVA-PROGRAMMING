package ternaryAndLogicalOperator;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number:");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number:");
        int thirdNumber = input.nextInt();
        System.out.print("Enter fourth number:");
        int fourthNumber = input.nextInt();
        System.out.print("Enter fifth number:");
        int fifthNumber = input.nextInt();

        String result = ((firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber) ? "The largest number is: " + (firstNumber):
                "\nThe first number is not the largest");
        System.out.println(result);

        String result2 = ((secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber) ? "The largest number is: " + (secondNumber):
                "\nThe second number is not the largest");
        System.out.println(result2);

        String result3 = ((thirdNumber > firstNumber && thirdNumber > secondNumber  && thirdNumber > fourthNumber && thirdNumber > fifthNumber) ? "The largest number is: " + (thirdNumber):
                "\nThe third number is not the largest");
        System.out.println(result3);

        String result4 = ((fourthNumber > firstNumber && fourthNumber > secondNumber  && fourthNumber > thirdNumber && fourthNumber > fifthNumber) ? "The largest number is: " + (thirdNumber):
                "\nThe fourth number is not the largest");
        System.out.println(result4);

        String result5 = ((fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber) ? "The largest number is: " + (firstNumber):
                "\nThe fifth number is not the smallest");
        System.out.println(result5);



        String result6 = ((firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber) ? "The smallest number is: " + (firstNumber):
                "\nThe first number is not the smallest");
        System.out.println(result6);

        String result7 = ((secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber) ? "The smallest number is: " + (secondNumber):
                "\nThe second number is not the smallest");
        System.out.println(result7);

        String result8 = ((thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber) ? "The smallest number is: " + (thirdNumber):
                "\nThe third number is not the smallest");
        System.out.println(result8);

        String result9 = ((fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber) ? "The smallest number is: " + (fourthNumber):
                "\nThe fourth number is not the smallest");
        System.out.println(result9);

        String result10 = ((fifthNumber < firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber) ? "The smallest number is: " + (fifthNumber):
                "\nThe fifth number is not the smallest");
        System.out.println(result10);



    }
}
