package ru.homework.lesson9;

public class SumArray {

    public static final int SIZE  = 4;

    public static int sum (String [][] arr) {
        if (arr.length != SIZE) throw new MyArraySizeException("Необходим массив 4х4");

        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != SIZE) throw new MyArraySizeException("Необходим массив 4х4");
            for (int x = 0; x < arr.length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Данные в ячейке не являются числом: [%d][%d]", x+1, y+1));
                }
            }
        }
        System.out.println("Сумма равна = " + sum);
        return sum;
    }

}
