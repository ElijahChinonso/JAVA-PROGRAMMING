package arrayAndArrayList;

public class E2D {
    public static void main(String... args) {
//        int[][] e = new int[2][2];
//        e[0][0] = 2;
//        e[0][1] = 6;
//        //e[1][0] = 3;
//        e[1][1] = 1;
        int[][] e = {{1, 2, 0}, {4, 5, 6}};

        for (int i= 0; i < e.length; i++) {
            for (int t = 0; t < 3; t++) {
                System.out.print(e[i][t]);
            }
        }
    }
}
