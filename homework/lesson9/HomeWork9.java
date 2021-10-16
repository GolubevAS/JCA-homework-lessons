package ru.homework.lesson9;

public class HomeWork9 {

    public static void main(String[] args) {

        String [][] arr1 = new String[][] {     //массив в котором все ОК
                {"5","5","5","5"},
                {"34","32","11","78"},
                {"13","25","67","94"},
                {"4098","-5","33","-21"}
        };

        String [][] arr2 = new String[][] {     //массив, который не соответствует размеру
                {"5","5","5","5"},
                {"34","32","11","78","32"},
                {"13","25","67","94"},
                {"4098","-5","33","-21","32"}
        };

        String [][] arr3 = new String[][] {     //массив в котором присутствует нечитаемый символ
                {"5","5","5","5"},
                {"34","32","xp","78"},
                {"13","we","67","94"},
                {"4098","-5","33","-21"}
        };

        try {
            SumArray.sum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            SumArray.sum(arr2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            SumArray.sum(arr3);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
