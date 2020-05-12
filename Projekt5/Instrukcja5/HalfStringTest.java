package HalfTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalfStringTest {
    public Main hs = new Main();

    @Test
    void HalfStrTest() {
        assertEquals( 2, hs.halfString(4));
    }
}

