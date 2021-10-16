package ru.homework.lesson2;



public class LessonTwo4 {
    public static void main(String... args) {

        // fourth task

        int[] lesson2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Let's declare an array and initialize it

        int max = lesson2[0];
        int min = lesson2[0];

        for(int i = 0; i < lesson2.length; i ++){
            if(lesson2[i] > max){
                max = lesson2[i];
            }
            if(lesson2[i] < min){
                min = lesson2[i];
            }
            System.out.println(max);
            System.out.println(min);

    }}}

