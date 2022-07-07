package calculatorAndMethDeeperLooks;

public class Utme {
    private int price = 0;

    public int priceOfCopy(int noOfCopies) {
        if (noOfCopies <= 4) {
            price = 2000;
            System.out.println("Available");
        }

        if (noOfCopies >= 5 && noOfCopies <= 9){
            price = 1800;
            System.out.println("Available");
        }

        if (noOfCopies >= 10 && noOfCopies <= 29){
            price = 1600;
            System.out.println("Available");
        }

        if (noOfCopies >= 30 && noOfCopies <= 49){
            price = 1500;
            System.out.println("Available");
        }

        if (noOfCopies >= 50 && noOfCopies <= 99){
            price = 1300;
            System.out.println("Available");
        }

        if (noOfCopies >= 100 && noOfCopies <= 199){
            price = 1200;
            System.out.println("Available");
        }

        if (noOfCopies >= 200 && noOfCopies <= 499){
            price = 1100;
            System.out.println("Available");
        }

        if (noOfCopies >= 500){
            price = 1000;
            System.out.println("Available");
        }
        return price;
    }
}