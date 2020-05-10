package Instrukcja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public Main temp = new Main();

    @Test
    void Spelnia(){
        assertFalse(temp.temperatura(100,100));
    }
    @Test
    void NieSpelnia(){
        assertTrue(temp.temperatura(100,100));

    }
}
