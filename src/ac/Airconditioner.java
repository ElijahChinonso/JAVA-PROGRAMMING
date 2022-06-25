package ac;

import java.sql.SQLOutput;

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

    public String isOff(String off) throws Exception {
        if (off == "off") {
            System.out.println("ac is off");
        }
        else {
            throw new Exception("enter proper is off");
        }
        return off;
    }

    public int increaseTemp(int temp) throws Exception {
        if(temp > 30){
            throw new Exception ("valid temp");
        }
        else {
            System.out.println("Temperature has increased to: " + temp);
        }
        return temp;
    }

    public int decreaseTemp(int temp) throws Exception{
        if (temp < 16){
            throw new Exception("invalid temp");
        }
        else {
            System.out.println("Temperature has decreased to: " + temp);
        }
        return temp;
    }
}
