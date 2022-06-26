package notePad;

public class Car {

    //Decleration of instance variables
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Setter for the instance variable - model
    public void setModel(String carModel){
        this.model = carModel;
    }
    //getter for the instance variable - model
    public String getModel(){
        return model;
    }

    public void setYear(String carYear){
        this.year = carYear;
    }

    public String getYear(){
        return year;
    }
    public void setPrice(double thePrice){
        if(price > 0.00) this.price = thePrice;
    }

    public double getPrice(){
        return price;
    }
}

