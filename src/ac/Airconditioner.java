package ac;

public class Airconditioner {

    public String isOn(String on) throws Exception {
        if (on == "on") {
            System.out.println("ac is on");
        }
        else {
            throw new Exception("enter proper is on");
        }
        return on;
    }
}