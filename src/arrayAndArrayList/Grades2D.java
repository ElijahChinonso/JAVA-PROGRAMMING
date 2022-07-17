package arrayAndArrayList;

public class Grades2D {
    public static void main(String[] args) {

        int [][] grades = new int [2][];
        // create 5 columns for row 0 and 3 columns for row 1
        grades[0] = new int[5];
        grades[1] = new int[3];

        grades[0][0] = 3;
        grades[0][1] = 6;
        grades[0][2] = 0;
        grades[0][3] = 2;
        grades[0][4] = 8;

        grades[1][0] = 5;
        grades[1][1] = 9;
        grades[1][2] = 7;



        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(grades[i][j]);
            }
        }
    }
}
