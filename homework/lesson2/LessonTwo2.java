package ru.homework.lesson2;

import java.util.Arrays;

public class LessonTwo2 {
    public static void main(String... args) {

        // Second task

        int [] lesson2 = new int[8];

        int z = 0;
        for (int i = 0; i < lesson2.length; i++) {
            lesson2[i] = z;
            z +=3;
        }

        System.out.println(Arrays.toString(lesson2));
    }
}


