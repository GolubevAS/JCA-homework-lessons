package ru.homework.lesson12;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class HW_lesson12 {

    private static final int SIZE = 10_000_000;
    private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {
        float[] d1 = newArray(SIZE);
        measureTime(() -> consistentMethod(d1), "consistentMethod");

        float[] d2 = newArray(SIZE);
        measureTime(() -> parallelMethod(d2), "parallelMethod");
        System.out.println("Equal: " + Arrays.equals(d1, d2));

    }



    private static float[] newArray(int size) {
        float[] data = new float[size];
        Arrays.fill(data, 1.0f);
        return data;
    }


    private static void parallelMethod(float[] data) {
        float[] section1 = Arrays.copyOfRange(data, 0, HALF_SIZE);
        float[] section2 = Arrays.copyOfRange(data, HALF_SIZE, data.length);

        Thread thread1 = new Thread(() -> consistentMethod(section1, 0));
        Thread thread2 = new Thread(() -> consistentMethod(section2, HALF_SIZE));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Execution aborted!");
            e.printStackTrace();
            return;
        }

        System.arraycopy(section1, 0, data, 0, HALF_SIZE);
        System.arraycopy(section2, 0, data, HALF_SIZE, HALF_SIZE);

    }


    private static void consistentMethod(float[] data) {
        consistentMethod(data, 0);
    }

    private static void consistentMethod(float[] data, int offset) {
        for (int index = 0; index < data.length; index++) {
            float currentValue = data[index];
            data[index] = computeValue(index + offset, currentValue);
        }
    }




    private static float computeValue(int index, float currentValue) {
        return (float)(currentValue * Math.sin(0.2f + index / 5.0) * Math.cos(0.2f + index / 5.0) * Math.cos(0.4f + index / 2.0));
    }

    private static void measureTime(Runnable action, String actionName) {
        long start = System.nanoTime();
        action.run();
        long finish = System.nanoTime();
        long duration = finish - start;
        System.out.printf("Method '%s' took %d ms%n", actionName, TimeUnit.NANOSECONDS.toMillis(duration));
    }



}
