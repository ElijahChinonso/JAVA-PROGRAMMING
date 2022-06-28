package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    public Motor driver;

    @BeforeEach
    public  void initSetup(){ driver = new Motor();}


    @Test
    public void test_getAndSetBrandName(){
        driver.setBrand("JoveM");
        String getBrand = driver.getBrand();
        Assertions.assertEquals(getBrand, "JoveM");
    }


    @Test
    public void test_getAndSetPlateNumber(){
        driver.setPlateNumber(3426);
        int getPlateNumber = driver.getPlateNumber();
        Assertions.assertEquals(getPlateNumber, 3426);
    }


    @Test
    public void test_getAndSetColor(){
        driver.setColor("Blue");
        String getColor = driver.getColor();
        Assertions.assertEquals(getColor, "Blue");
    }

    @Test
    public void test_getAndSetBrake(){
        driver.setBrake("Stop");
        String getBrake = driver.getBrake();
        Assertions.assertEquals(getBrake, "Stop");
    }


    @Test
    public void gearOfCar() throws Exception {
        int result = driver.gearOfCar(3,21);
        Assertions.assertEquals(result,21);
    }
}