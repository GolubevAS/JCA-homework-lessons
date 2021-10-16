package ru.homework.lesson2;

import java.util.Arrays;

public class LessonTwo1 {
    public static void main(String... args) {

        // First task

        int [] lesson2 = new int[10]; // Let's declare an array and initialize it
        lesson2 [0] = 1;
        lesson2 [1] = 1;
        lesson2 [2] = 0;
        lesson2 [3] = 0;
        lesson2 [4] = 1;
        lesson2 [5] = 0;
        lesson2 [6] = 1;
        lesson2 [7] = 1;
        lesson2 [8] = 0;
        lesson2 [9] = 0;

        System.out.println(Arrays.toString(lesson2)); // Let's print all the elements and check that everything is OK


        for (int i = 0; i < lesson2.length; i++) {   // Solving the task
            if (lesson2[i] == 0) {
                lesson2[i] = 1;
            } else if (lesson2[i] == 1) {
                lesson2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(lesson2));





    }
}


