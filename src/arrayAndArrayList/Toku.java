package arrayAndArrayList;

public class Toku {
    public static void main(String[] args) {
        // nested array initializers
        int[][] cafini = {{6,4,7}, {3,6,9}};
        int[][] doku = {{2,7}, {8}, {3,56,80}};

        System.out.println("values in cafini by row are");
        outputArray(cafini);  // display cafini by row
        System.out.println("values in doku by row are");
        outputArray(doku);  // display doku by row
    }
    private static void outputArray(int[][] array) {
        for (int row = 0; row < array.length; row++){
            for (int coloumn = 0; coloumn < array[row].length; coloumn++){
                System.out.printf("%d  ", array[row][coloumn]);
            }
            System.out.println();
        }
    }
}
