package Instrukcja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
public Main rev = new Main();

@Test
    void revTestTrue(){
    int array[] = new int[]{3,2,1};
    assertArrayEquals(array, rev.reverse()); //musiałem zmienić w klasie Main zmienną String na int, aby metoda assert mogła zadziałać.
}
}
