package notePad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathematicsTest {

    public SimpleMathematics Keep;

    @BeforeEach
       public void initSetup(){
        SimpleMathematics keep = new SimpleMathematics();
    }

    @Test
    public void test_addTwoNumbers() {
        SimpleMathematics keep = new SimpleMathematics();
        int result = keep.addTwoNumbers(54, 92);
        Assertions.assertEquals(result, 146);
    }

}