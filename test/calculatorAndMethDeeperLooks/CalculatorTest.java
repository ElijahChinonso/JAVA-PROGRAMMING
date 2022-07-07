package calculatorAndMethDeeperLooks;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    //Instanciation of Calculator class
    //Using the Calculator as an Instance variable
    public Calculator just;

    @BeforeEach
    public void initSetup() {
        //creating an object of the class.
        just = new Calculator();
    }

    @Test
    public void test_addTwoNumbers() {
        int result = just.addTwoNumbers(4, 2);
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void test_subTwoNumbers() {
        int result = just.subTwoNumbers(4, 2);
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void test_mulTwoNumbers() {
        int result = just.mulTwoNumbers(4,2);
        Assertions.assertEquals(result,8);
    }

    @Test
    public void test_divTwoNumbers() {
        int result = just.divTwoNumbers(4,2);
        Assertions.assertEquals(result, 2);
    }
}


