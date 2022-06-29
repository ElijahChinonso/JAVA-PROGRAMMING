package vehicle;

public class ElijahOilAndGas {

    private String name;
    private String location;
    private String color;
    private int perLiter = 200;
    private double discount;



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

    public void setPricePerLiter(int perLiter) {
        this.perLiter = perLiter;
    }

    public  void setDiscount(double num){this.discount = num;}


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


}
