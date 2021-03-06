package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.PropertyEditorSupport;

import static org.junit.jupiter.api.Assertions.*;

class ElijahOilAndGasTest {

    private ElijahOilAndGas fuelStation;

    @BeforeEach
    void initSetup() {fuelStation = new ElijahOilAndGas();}


    @Test
    public void setAndGetCompanyName(){
        fuelStation.setName("EAG Plc");
        String getName = fuelStation.getName();
        Assertions.assertEquals(getName,"EAG Plc");
    }

    @Test
    public void setAndGetCompanyLocation(){
        fuelStation.setLocation("Num 32, Jason Grape Ave");
        String getLocation = fuelStation.getLocation();
        Assertions.assertEquals(getLocation, "Num 32, Jason Grape Ave");
    }

    @Test
    public void setAndGetCompanyColor(){
        fuelStation.setColor("Blue");
        String getColor = fuelStation.getColor();
        Assertions.assertEquals(getColor, "Blue");
    }


    @Test
    public void setAndGetPricePerLiter(){
        fuelStation.setPerLiter(200);
        int result = fuelStation.getPerLiter();
        Assertions.assertEquals(result, 200);
    }


    @Test
    public void test_setAndGetDiscount(){
        fuelStation.setDiscount(10);
        double result = fuelStation.getDiscount();
        Assertions.assertEquals(result, 10);
    }

    @Test
    public void test_calculateDiscount(){
        fuelStation.calculateTheDiscount(10);
        int result = fuelStation.calculateInDiscount(10);
        Assertions.assertEquals( result,20);
    }

}