package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BikeTest {

    public Bike rider;

    @BeforeEach
    public void initSetup() { rider = new Bike();}

    @Test
    public void test_isOn() throws Exception{
        String result = rider.isOn("on");
        Assertions.assertEquals(result,"on");
    }

    @Test
    public void test_isOnIsInvalid() throws Exception{
        String result = rider.isOn("on");
        Assertions.assertEquals(result,"on");
    }


    @Test
    public void test_isOff() throws Exception{
        String result = rider.isOff("off");
        Assertions.assertEquals(result,"off");
    }

    @Test
    public void test_isOffIsInvalid() throws Exception{
        String result = rider.isOff("off");
        Assertions.assertEquals(result,"off");
    }


    @Test
    public void test_gearOne() throws Exception{
        int result = rider.accelerateGearOne(1,18);
        Assertions.assertEquals(result,19);
    }

    @Test
    public void test_gearOneInvalid() throws Exception{
        int result = rider.accelerateGearOne(1,32);
        Assertions.assertEquals(result, 35);
    }


    @Test
    public void test_gearTwo() throws Exception{
        int result = rider.accelerateGearTwo(2,22);
        Assertions.assertEquals(result,24);
    }

    @Test
    public void test_gearTwoInvalid() throws Exception{
        int result = rider.accelerateGearTwo(2,31);
        Assertions.assertEquals(result, 34);
    }

    @Test
    public void test_gearThree() throws Exception{
        int result = rider.accelerateGearThree(3,32);
        Assertions.assertEquals(result,35);
    }

    @Test
    public void test_gearThreeInvalid() throws Exception{
        int result = rider.accelerateGearThree(3,20);
        Assertions.assertEquals(result, 21);
    }


    @Test
    public void test_gearFour() throws Exception{
        int result = rider.accelerateGearFour(4,42);
        Assertions.assertEquals(result,46);
    }

    @Test
    public void test_gearFourInvalid() throws Exception{
        int result = rider.accelerateGearFour(4,35);
        Assertions.assertEquals(result, 38);
    }

    @Test
    public void test_decelerateGearOne() throws Exception{
        int result = rider.decelerateGearOne(1,24);
        Assertions.assertEquals(result, 22);
    }

    @Test
    public void test_decelerateGearOneInvalid() throws Exception{
        int result = rider.decelerateGearOne(1,35);
        Assertions.assertEquals(result, 32);
    }

    @Test
    public void test_decelerateGearTwo() throws Exception{
        int result = rider.decelerateGearTwo(2,34);
        Assertions.assertEquals(result, 31);
    }

    @Test
    public void test_decelerateGearTwoInvalid() throws Exception{
        int result = rider.decelerateGearTwo(2,35);
        Assertions.assertEquals(result, 32);
    }

    @Test
    public void test_decelerateGearThree() throws Exception{
        int result = rider.decelerateGearThree(3,50);
        Assertions.assertEquals(result, 46);
    }

    @Test
    public void test_decelerateGearThreeInvalid() throws Exception{
        int result = rider.decelerateGearThree(3,3);
        Assertions.assertEquals(result, 2);
    }


    @Test
    public void test_decelerateGearFour() throws Exception{
        int result = rider.decelerateGearFour(4,50);
        Assertions.assertEquals(result, 46);
    }

    @Test
    public void test_decelerateGearFourInvalid() throws Exception{
        int result = rider.decelerateGearFour(4,26);
        Assertions.assertEquals(result, 24);
    }
}