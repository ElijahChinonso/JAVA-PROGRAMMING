package ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {

    public Airconditioner setup;

    @BeforeEach
    public void initSetup(){
        setup = new Airconditioner();
    }

    @Test
    public void test_isOn() throws Exception {
        String result = setup.isOn("on");
        Assertions.assertEquals(result, "on");
    }

    @Test
    public void test_isOff() throws Exception {
        String result = setup.isOff("off");
        Assertions.assertEquals(result, "off");
    }


    @Test
    public void test_increaseTemp() throws Exception{
        int result = setup.increaseTemp(25);
        Assertions.assertEquals(result, 25);
    }


    @Test
    public void test_increaseTempIsInvalid() throws Exception{
        int result = setup.increaseTemp(65);
        Assertions.assertEquals(result, 65);
    }


    @Test
    public void test_decreaseTemp() throws Exception{
        int result = setup.decreaseTemp(31);
        Assertions.assertEquals(result, 31);
    }


    @Test
    public void test_decreaseTempIsInValid() throws Exception{
        int result = setup.decreaseTemp(2);
        Assertions.assertEquals(result, 2);
    }
}