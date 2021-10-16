package ru.homework.lesson1;

import java.util.Scanner;

public class LessonOne4 {

    // Fourth task
    public static void main(String... args) {
        System.out.println("Добрый день. Введите первое число");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        System.out.println("a =  " + a);
        System.out.println("Добрый день. Введите второе число");
        int b = scaner.nextInt();
        System.out.println("b =  " + b);

        boolean booleanFourthTask = 10 < (a + b) && (a + b) <= 20;
        System.out.println(booleanFourthTask);



    }}