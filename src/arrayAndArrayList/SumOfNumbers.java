package arrayAndArrayList;

public class SumOfNumbers {
    public static void main(String[] args) {

        int[] array = {5,6,7,9,10};
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.printf("Total of array elements:  %d%n", total);
    }
}
