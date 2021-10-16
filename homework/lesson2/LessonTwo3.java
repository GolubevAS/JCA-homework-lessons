package ru.homework.lesson2;

import java.util.Arrays;

public class LessonTwo3 {
    public static void main(String... args) {

        // Third task

        int [] lesson2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 } ; // Let's declare an array and initialize it

        for (int i = 0; i < lesson2.length; i++) {   // Solving the task
            if (lesson2[i] < 6) {
                lesson2[i] = lesson2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(lesson2));






    }
}


