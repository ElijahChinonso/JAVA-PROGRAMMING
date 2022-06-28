package ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    public AirConditioner setup;

    @BeforeEach
    public void initSetup(){
        setup = new AirConditioner();
    }

    @Test
    public void test_isOn() {
        setup.isOn();
        assertTrue(setup.isOn());
    }

    @Test
    public void test_isOff() {
        setup.isOn();
        setup.isOff();
        assertFalse(setup.isOff());

    }


    @Test
    public void test_increaseTemp() {
        setup.isOn();
        setup.increaseTemp(12);
        assertEquals(28,setup.getTemp());
    }


    @Test
    public void test_increaseTempAbove30IsInvalid() {
        setup.isOn();
        assertTrue(setup.isOn());
        setup.increaseTemp(15);
        assertEquals(30, setup.getTemp());
    }


    @Test
    public void test_decreaseTemp() {
        setup.isOn();
        setup.increaseTemp(10);
        assertEquals(26, setup.getTemp());
        setup.decreaseTemp(9);
        assertEquals(17, setup.getTemp());
    }


    @Test
    public void test_decreaseTempBelow16IsInValid() {
        setup.isOn();
        setup.increaseTemp(9);
        assertEquals(25, setup.getTemp());
        setup.decreaseTemp(10);
        assertEquals(16, setup.getTemp());
    }
}