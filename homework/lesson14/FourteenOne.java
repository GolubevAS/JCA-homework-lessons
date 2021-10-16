package ru.homework.lesson14;

import java.util.Arrays;

public class FourteenOne {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {2,3,9,9,1,4,4,1};
        int[] arr3 = {5,5,1,4,1,5};
        int[] arr4 = {1,1,5};

        System.out.println(Arrays.toString(checkArrayOne(arr2)));

    }

    public static int[] checkArrayOne(int[] arr) {
        int x = 0;
        int [] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if (arr[j] == 4) continue;
                    result[k] = arr[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return result;
    }





}
