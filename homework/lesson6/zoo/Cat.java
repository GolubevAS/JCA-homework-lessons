package ru.homework.lesson6.zoo;

public class Cat extends Animals  {

    public Cat (String name, String color) {
        super(name, color, "cat");
    }



    @Override
    public void toRun (int lenghtOfTheObstacle) {
        if (lenghtOfTheObstacle < 200) {
            System.out.printf(" %s %s  %s run to street " + lenghtOfTheObstacle + " meters\n", color, type, name);
        } else {
            System.out.printf("The cat cannot run that much\n");
        }
    }

    @Override
    public void toSwim (int lenghtOfTheObstacle) {
            System.out.printf("The cat can't swim\n ");
    }


}
