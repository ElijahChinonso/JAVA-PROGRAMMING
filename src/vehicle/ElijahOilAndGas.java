package vehicle;

public class ElijahOilAndGas {

    private String name;
    private String location;
    private String color;
    private double price;

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

    public void setPrice(double price) {
        this.price = price;
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

    public double getPrice(){
        return price;
    }


}
