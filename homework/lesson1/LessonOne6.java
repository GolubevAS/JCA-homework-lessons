package ru.homework.lesson1;

import java.util.Scanner;

public class LessonOne6 {

    // sixth task
    public static void main(String... args) {
        System.out.println("Добрый день. Введите целое число");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        System.out.println("Вы ввели " + a + ". Спасибо!");

        boolean booleansixthTask = a < 0 ;
        System.out.println(booleansixthTask);

}}