package oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildTest {

    public Child son;

    @BeforeEach
    void initSetup() {son = new Child();}


    @Test
    public void test_name(){
        String result = son.name("Elijah");
        Assertions.assertEquals(result, "Elijah");
    }

}