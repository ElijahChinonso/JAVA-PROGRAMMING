package vehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}