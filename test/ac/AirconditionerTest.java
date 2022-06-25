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

}