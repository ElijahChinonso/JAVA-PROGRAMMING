package arrayAndArrayList;

import java.util.Scanner;

public class SevenSegment {
    public static void main(String[] args)throws InterruptedException, IllegalAccessException {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter binary:");
//        int choice = input.nextInt();
//        String mask = String.valueOf(choice);

        fig("1111110");
        fish();
    }

    private static final int[][] cap = new int[5][4];

    static  void sideA() {
        cap[0][0] = 1;
        cap[0][1] = 1;
        cap[0][2] = 1;
        cap[0][3] = 1;
    }

    static  void sideB() {
        cap[0][3] = 1;
        cap[1][3] = 1;
        cap[2][3] = 1;
    }

    static  void sideC() {
        cap[2][3] = 1;
        cap[3][3] = 1;
        cap[4][3] = 1;
    }

    static  void sideD() {
        cap[4][0] = 1;
        cap[4][1] = 1;
        cap[4][2] = 1;
        cap[4][3] = 1;
    }

    static  void sideE() {
        cap[2][0] = 1;
        cap[3][0] = 1;
        cap[4][0] = 1;
    }

    static  void sideF() {
        cap[0][0] = 1;
        cap[1][0] = 1;
        cap[2][0] = 1;
    }

    static  void sideG() {
        cap[2][0] = 1;
        cap[2][1] = 1;
        cap[2][2] = 1;
        cap[2][3] = 1;
    }


    static void fish()throws InterruptedException{
        for (int[] i : cap){
            for(int j : i){
                if(j == 1) {
                    System.out.print("# ");
                }
                else
                    System.out.print("  ");
                Thread.sleep(300);
            }
            System.out.println();
        }
    }

    static void fig(String num)throws IllegalAccessError, IllegalAccessException{
        if(num.length() > 8){
            num = num.substring(0, 8);
        }
        char[] array  = num.toCharArray();
        for(char i : array){
            if(!(i == '1' || i == '0')) {
                throw new IllegalAccessException("Input must be 1 or 0");
            }
        }

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '1'){
                switch (i){
                    case 0 -> sideA();
                    case 1 -> sideB();
                    case 2 -> sideC();
                    case 3 -> sideD();
                    case 4 -> sideE();
                    case 5 -> sideF();
                    case 6 -> sideG();
                }
            }
        }
    }

}
