package loopsAndSwitch;

public class Number {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            int number = 1;
            for (int j = 1; j <= i; j++){
                System.out.printf("%d ", number);
                number++;
            }
            System.out.println();
        }
    }
}
