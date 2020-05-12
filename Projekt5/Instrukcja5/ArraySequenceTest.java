package Instrukcja1;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ArraySequenceTest {
    public Main seq = new Main();

    @Test
    void testTrue() {
        int[] tab = new int[]{1,2,3};
        assertTrue(seq.sekwencja(tab));
    }
    @Test
    void testFalse1() {
        int[] tab = new int[]{1,1,1};
        assertFalse(seq.sekwencja(tab));
    }
    @Test
    void testFalse2() {
        int[] tab = new int[]{2,1,3,6,3,8};
        assertFalse(seq.sekwencja(tab));
    }
    @Test
    void testFalse3() {
        int[] tab = new int[]{0};
        assertFalse(seq.sekwencja(tab));
    }
}
