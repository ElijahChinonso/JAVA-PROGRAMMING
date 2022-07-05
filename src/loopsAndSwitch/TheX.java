package loopsAndSwitch;

public class TheX {

    public static void main(String[] args) {

        int n = 5;
        int s = 1;

        // for i is equal to 5, until i is greater or equal to 1, i should decrease by 1
        for(int i = n; i >= 1; i--){

            // for space is equal to 5 - 1, as long as space is greater or equal 1, space should decrease by 1
            for(int sp = i - 1; sp >= 1; sp--){
                // print space
                System.out.print("   ");
            }
            //for k is equal 1 as long as it is lesser or equal to star, k should increase by 1
            for(int k = 1; k <= s; k++ ){

                // print star with accurate space with the above printed space
                System.out.printf("*  ");
            }

            System.out.println();
            // As Iteration takes place star is increased by 2
            s+=2;
        }

    }
}
