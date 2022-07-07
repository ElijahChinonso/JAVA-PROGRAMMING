package calculatorAndMethDeeperLooks;
// Roll six sided die 60,000,000 times
import java.security.SecureRandom;

public class RandomNum2 {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int sequence1 = 0;
        int sequence2 = 0;
        int sequence3 = 0;
        int sequence4 = 0;
        int sequence5 = 0;
        int sequence6 = 0;

        // tally counts for 60,000,000 rolls of a die
        for (int roll = 1; roll <= 60_000_000; roll++){
            int dieFace = 1 + randomNumbers.nextInt(6);

            // Ise dieFace to determine which counter to increment
            switch (dieFace){
                case 1:
                    ++sequence1; // increment the 1s counter
                    break;

                case 2:
                    ++sequence2;
                    break;

                case 3:
                    ++sequence3;
                    break;

                case 4:
                    ++sequence4;
                    break;

                case 5:
                    ++sequence5;
                    break;

                case 6:
                    ++sequence6;
                    break;
            }
        }
        System.out.println("dieFace\tSequence");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", sequence1, sequence2, sequence3, sequence4, sequence5, sequence6);
    }
}
