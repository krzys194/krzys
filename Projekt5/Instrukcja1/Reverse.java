package Instrukcja1;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
    reverse();
    }

    public static String reverse() {
        int[] array = new int[]{1, 2, 3};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int j = array.length - i - 1;
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
        return Arrays.toString(array);
    }
}