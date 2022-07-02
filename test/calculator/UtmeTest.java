package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtmeTest {
    private  Utme tt;

    @BeforeEach
    public void initSetup() {
        tt = new Utme();
    }
    @Test
    public void test_priceOfCopy1To4(){
         int result = tt.priceOfCopy(4);
        assertEquals(2000,result);
    }

    @Test
    public void test_priceOfCopy5To9(){
        int result = tt.priceOfCopy(6);
        assertEquals(1800,result);

    }

    @Test
    public void test_priceOfCopy10To29(){
        int result = tt.priceOfCopy(28);
        assertEquals(1600,result);
    }

    @Test
    public void test_priceOfCopy30To49(){
        int result = tt.priceOfCopy(40);
        assertEquals(1500,result);
    }

    @Test
    public void test_priceOfCopy50To99(){
        int result = tt.priceOfCopy(79);
        assertEquals(1300,result);
    }

    @Test
    public void test_priceOfCopy100To199(){
        int result = tt.priceOfCopy(130);
        assertEquals(1200,result);
    }

    @Test
    public void test_priceOfCopy200To499(){
        int result = tt.priceOfCopy(300);
        assertEquals(1100,result);
    }

    @Test
    public void test_priceOfCopy500AndAbove(){
        int result = tt.priceOfCopy(5000);
        assertEquals(1000,result);
    }
}