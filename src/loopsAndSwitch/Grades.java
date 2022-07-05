package loopsAndSwitch;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 6){
        System.out.println("Enter number");
        int number = input.nextInt();

        switch (number){
            case 90:
                System.out.println("A");
                break;
            case 60:
                System.out.println("B");
                break;
            case 50:
                System.out.println("C");
                break;
            case 40:
                System.out.println("D");
                break;
            case 30:
                System.out.println("E");
                break;
            case 20:
                System.out.println("F");
                break;

            default:
                System.out.println("No grade");

        }
        count++;
    }
    }
}
