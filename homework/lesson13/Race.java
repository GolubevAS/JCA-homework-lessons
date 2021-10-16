package ru.homework.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

public class Race {

    private final ArrayList<Stage> stages;
    private static int winnerCount;
    private final int carsCount;
    private final CyclicBarrier barrier;



    public Race(int carsCount, Stage... stages) {
        this.carsCount = carsCount;
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.barrier = initBarrier();

    }

    public void makeRace() {
        System.out.println("Preparation!!!\n");
        Car[] cars = new Car[carsCount];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(this, 30 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
    }

    private CyclicBarrier initBarrier() {
        return new CyclicBarrier(carsCount, () -> {
        });
    }

    public synchronized void finish(Car car) {
        if (winnerCount++ == 0) {
            System.out.printf("We have a winner: %s\n", car.getName());
        } else {
            System.out.printf("%s came %sм\n", car.getName(), winnerCount);
        }
    }

    public CyclicBarrier getBarrier() {
        return barrier;
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public int getCarsCount() {
        return carsCount;
    }




}
