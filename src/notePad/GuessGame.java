package notePad;

import java.util.Scanner;
public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctNum = 20;
        System.out.println("Enter guessNumber");
        int guessNum1 = input.nextInt();

        if (guessNum1 == correctNum) {
            System.out.println("Correct Guess Number");
        }
        else {
            System.out.println("Try again");
        }

        if(guessNum1 > correctNum){
            System.out.println("Too much");
        }
        if(guessNum1 < correctNum){
            System.out.println("Too less");
        }
    }
}

