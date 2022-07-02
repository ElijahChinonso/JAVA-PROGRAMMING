package vehicle;

public class ElijahOilAndGas {

    private String name;
    private String location;
    private String color;
    private int perLiter = 200;
    private double discount = 10;
    private int calculateDiscount;


    public ElijahOilAndGas() {}

    public void setName(String name) {
        if (name == "name") {
            System.out.println("EAG Plc");
        }
        this.name = name;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPerLiter(int price) {
        if (price == price){
            System.out.println("Exact price");
        }
        else {
            System.out.println("Invalid");
        }
        this.perLiter = price;
    }

    public  void setDiscount(double amount) {
        if (amount == amount){
            System.out.println("Discount added");
        }
        else {
            System.out.println("No Discount");
        }
        this.discount = amount;
    }


    public void calculateTheDiscount(int percent){
        if (percent == percent){
            System.out.println("Actual discount");
        }
        else {
            System.out.println("Wrong discount");
        }
        this.calculateDiscount =percent;
    }




    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getColor(){
        return color;
    }

    public int getPerLiter(){
        return perLiter;
    }

    public double getDiscount(){
        return discount;
    }

    public int calculateInDiscount(int percent){
        return percent * perLiter / 100;
    }

}
