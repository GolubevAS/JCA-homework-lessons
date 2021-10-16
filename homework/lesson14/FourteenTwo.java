package ru.homework.lesson14;

import java.util.Arrays;

public class FourteenTwo {

    public static void main(String[] args) throws Exception {
        {
            int[] array = {4, 4, 1, 4};
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Result: " + checkArray(array, 1, 4));
        }

        {
            int[] array = {4, 4, 4, 4};
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Result: " + checkArray(array, 1, 4));
        }

        {
            int[] array = {1, 1, 1};
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Result: " + checkArray(array, 1, 4));
        }

        {
            int[] array = {1, 4, 4, 4, 1};
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Result: " + checkArray(array, 1, 4));
        }
    }

    public static boolean checkArray(int[] array, int value1, int value2) {
        boolean containsValue1 = false;
        boolean containsValue2 = false;

        for (int value : array) {
            if (value == value1)
                containsValue1 = true;
            else if (value == value2)
                containsValue2 = true;
            else
                return false;
        }

        return containsValue1 && containsValue2;
    }

}
