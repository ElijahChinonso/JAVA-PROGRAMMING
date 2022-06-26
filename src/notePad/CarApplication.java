package notePad;

public class CarApplication {

    public static void main(String[] args){
        //First object of class Car
        Car toyota = new Car("E350", "2018", 300.00);
        //Second object of class Car
        Car honda = new Car("Hu350","2010", 250.00);
        //Display prices
        System.out.println("The price of toyota is" + toyota.getPrice());
        System.out.println("The price of honda is" + honda.getPrice());
    }
}

