package Instrukcja1;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ArraySequenceTest {
    public Main seq = new Main();

    @Test
    void testPrawda() {
        int[] tab = new int[]{1, 2, 3};
        assertTrue(seq.sekwencja(tab));
    }

    @Test
    void testFalsz() {
        int[] tab = new int[]{1, 1, 1};
        assertFalse(seq.sekwencja(tab));
    }
}
