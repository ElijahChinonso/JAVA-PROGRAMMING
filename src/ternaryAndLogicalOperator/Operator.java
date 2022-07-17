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

        String result = ((firstNumber > secondNumber && firstNumber > thirdNumber) ? "The largest number is: " + (firstNumber):
                "The first number is not the largest");
        System.out.println(result);

        String result2 = ((secondNumber > firstNumber && secondNumber > thirdNumber) ? "The largest number is: " + (secondNumber):
                "The second number is not the largest");
        System.out.println(result2);

        String result3 = ((thirdNumber > firstNumber && thirdNumber > secondNumber) ? "The largest number is: " + (thirdNumber):
                "The third number is not the largest");
        System.out.println(result3);

        String result4 = ((firstNumber < secondNumber && firstNumber < thirdNumber) ? "The smallest number is: " + (firstNumber):
                "The first number is not the smallest");
        System.out.println(result4);

        String result5 = ((secondNumber < firstNumber && secondNumber < thirdNumber) ? "The smallest number is: " + (secondNumber):
                "The second number is not the smallest");
        System.out.println(result5);

        String result6 = ((thirdNumber < firstNumber && thirdNumber < secondNumber) ? "The smallest number is: " + (thirdNumber):
                "The third number is not the smallest");
        System.out.println(result6);



    }
}
