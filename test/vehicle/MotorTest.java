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
        String result = driver.getColor();
        Assertions.assertNotNull(result);
    }

    @Test
    public void test_getAndSetBrake(){
        driver.setBrake("Stop");
        String getBrake = driver.getBrake();
        Assertions.assertEquals(getBrake, "Stop");
    }


    @Test
    public void test_gearOne() throws Exception {
        int result = driver.gearOne(1,14);
        Assertions.assertEquals(result,16);
    }

    @Test
    public void test_gearTwo() throws Exception{
        int result = driver.gearTwo(2,5);
        Assertions.assertEquals(result,6);
    }

    @Test
    public void test_gearThree() throws Exception{
        int result = driver.gearThree(3,25);
        Assertions.assertEquals(result,28);
    }
}