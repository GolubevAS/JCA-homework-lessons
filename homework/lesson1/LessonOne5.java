package ru.homework.lesson1;

import java.util.Scanner;

public class LessonOne5 {

    // Five task
    public static void main(String... args) {
        System.out.println("Добрый день. Введите любое число");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        if (a >= 0) {
            System.out.println("Ваше число положительное");
        } else {
            System.out.println("Ваше число отрицательное");
        }


    }

}