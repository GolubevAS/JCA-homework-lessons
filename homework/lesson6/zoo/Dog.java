package ru.homework.lesson6.zoo;

public class Dog extends Animals {

    public Dog (String name, String color) {
        super(name, color, "dog");
    }

    @Override
    public void toRun (int lenghtOfTheObstacle) {
        if (lenghtOfTheObstacle < 500) {
            System.out.printf(" %s %s  %s run to street " + lenghtOfTheObstacle + " meters\n", color, type, name);
        } else {
            System.out.printf("The dog cannot run that much\n");
        }
    }

    @Override
    public void toSwim (int lenghtOfTheObstacle) {
        if (lenghtOfTheObstacle < 10) {
            System.out.printf(" %s %s  %s swim " + lenghtOfTheObstacle + " meters\n", color, type, name);
        } else {
            System.out.printf("The dog cannot swim that much\n");
        }
    }


}
