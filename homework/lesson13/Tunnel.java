package ru.homework.lesson13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    private final Semaphore smp;

    public Tunnel(int length, int width) {
        this.length = length;
        this.description = "Tunnel " + length + " meters";
        this.smp = new Semaphore(width);
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " preparing for the stage (waiting): " + description);
                smp.acquire();
                System.out.println(c.getName() + " started stage: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " end of stage: " + description);
                smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
