package Instrukcja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public Main temp = new Main();

    @Test
    void TestFalse(){
        assertFalse(temp.temperatura(100,100));
    }
    @Test
    void TestTrue1(){
        assertTrue(temp.temperatura(90,100));
    }
    @Test
    void TestTrue2(){
        assertTrue(temp.temperatura(100,90));
    }
    @Test
    void TestTrue3(){
        assertTrue(temp.temperatura(90,90));
    }

}
