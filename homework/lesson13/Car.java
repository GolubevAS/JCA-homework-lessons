package ru.homework.lesson13;

public class Car implements Runnable {

    private final String name;
    private final int speed;
    private static int cars_count;
    private final Race race;



    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        cars_count++;
        this.name = "Participant #" + cars_count;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " preparing");
            Thread.sleep(140 + (int) (Math.random() * 70));
            System.out.println(this.name + " ready");
            race.getBarrier().await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            race.finish(this);
            race.getBarrier().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


}
