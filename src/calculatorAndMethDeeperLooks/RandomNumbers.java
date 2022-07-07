package calculatorAndMethDeeperLooks;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {

        // randomNumbers will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        for (int e = 1; e <= 20; e++){
            //pick random integer from 1 to 8
            int dieface = 1 + randomNumbers.nextInt(8);

            System.out.printf("%d  ", dieface); // display generated value

            // If this e divisible by 5, start a new line of output
            if (e % 5 == 0){
                System.out.println();
            }
        }
    }
}
