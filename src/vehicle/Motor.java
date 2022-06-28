package vehicle;

public class Motor {

    private String brand;
    private int plateNumber;
    private String color;
    private String brake;

    public Motor() {
    }

    public void setBrand(String name) {
        if (name == "name") {
            System.out.println("Correct name");
        }
        this.brand = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setPlateNumber(int num) {
        if (num == num) {
            System.out.println("Valid Number");
        }
        this.plateNumber = num;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setColor(String name) {
        if (name == "name") {
            System.out.println("Valid Name");
        }
        this.color = name;
    }

    public String getColor() {
        return color;
    }

    public void setBrake(String pressBreak) {
        if (pressBreak == "pressBrake") {
            System.out.println("Stop");
        }
        this.brake = pressBreak;
    }

    public String getBrake() {
        return brake;
    }

    public int gearOfCar(int gNum, int speedLimit) throws Exception {
        if (gNum == 1) {
            System.out.println("you are on gear 1");
        }
        else {
            if (gNum == 2) {
                System.out.println("You are on gear 2");
            }
            else {
                if (gNum == 3) {
                    System.out.println("You are on gear 3");
                }

                if(speedLimit >= 0 && speedLimit <= 10){
                    System.out.println("You are on gear 1");
                }

                if(speedLimit >= 11 && speedLimit <= 20){
                    System.out.println("you are now on gear 2");
                }

                if(speedLimit >= 21 && speedLimit <= 30){
                    System.out.println("You are now on gear 3");
                }
            }
        }
        return speedLimit;
    }
}
