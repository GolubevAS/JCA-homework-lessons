package ru.homework.lesson3;


//Second task

import java.util.Scanner;

public class LessonThree2 {

    private static Scanner scanner = new Scanner (System.in);

    public static void main (String ... args) {
        while (true) {
            System.out.println("Вам необходимо угадать число");
            System.out.println("Попытка 1");
            playGameProcessLevel1();
            System.out.println("Попытка 2");
            playGameProcessLevel2();
            System.out.println("Попытка 3");
            playGameProcessLevel3();


            System.out.println("Хотите повторить игру? 1- да; 0 -нет");
            int operation = scanner.nextInt();
            if (operation == 0) break;
        }

        //System.out.println("Вы выиграли!!!");

    }
    private static void playGameProcessLevel1 () {
        int number = (int) (Math.random() * 9);
        while (true) {
            System.out.println("Введите число от 0 до " + 9);
            int inputNumber = scanner.nextInt();
            if (number == inputNumber) {
                System.out.println("Вы угадали число!");
                break;
            } else if (number < inputNumber) {
                System.out.println("Загаданное число меньше");
            } else
                System.out.println("Загаданное число больше");
        }
    }
    private static void playGameProcessLevel2 () {
        int number = (int) (Math.random() * 9);
        while (true) {
            System.out.println("Введите число от 0 до " + 9);
            int inputNumber = scanner.nextInt();
            if (number == inputNumber) {
                System.out.println("Вы угадали число!");
                break;
            } else if (number < inputNumber) {
                System.out.println("Загаданное число меньше");
            } else
                System.out.println("Загаданное число больше");
        }
    }
    private static void playGameProcessLevel3 () {
        int number = (int) (Math.random() * 9);
        while (true) {
            System.out.println("Введите число от 0 до " + 9);
            int inputNumber = scanner.nextInt();
            if (number == inputNumber) {
                System.out.println("Вы угадали число!");
                break;
            } else if (number < inputNumber) {
                System.out.println("Загаданное число меньше");
            } else
                System.out.println("Загаданное число больше");
        }
    }



}