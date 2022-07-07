package calculatorAndMethDeeperLooks;

// Methods with multiple parameters//

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating-point values separated by spaces:  ");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result = maximum(num1, num2, num3);

        System.out.println("Maximum is: " + result);
    }
    // returns the maximum of its three double parameters
    public static double maximum(double x, double y, double z){
        double maximumValue = x;

        //determine whether y is greater than maximum value
        if (y > maximumValue){
            maximumValue = y;
        }

        //determine whether z is greater then maximun value
        if (z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
}
