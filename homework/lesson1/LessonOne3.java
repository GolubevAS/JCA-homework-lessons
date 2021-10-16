package ru.homework.lesson1;

public class LessonOne3 {

    // Third task. Create a method with the returned calculation result
    public static void main(String... args) {

        ThirdTask thirdTask1 = new ThirdTask();
        thirdTask1.a = 1.12f;      // initiated variables
        thirdTask1.b = 2.99f;
        thirdTask1.c = 1.32f;
        thirdTask1.d = 4.12f;
        float result1 = thirdTask1.thirdTaskMethod();
        System.out.println("Третье задание:  " + result1);

    }

    static class ThirdTask {       //Created a separate class
        float a;
        float b;
        float c;
        float d;

        float thirdTaskMethod() {   //Created a method with a given formula and a return value
            float result = a * (b + (c / d));
            return result;
        }
    }





}