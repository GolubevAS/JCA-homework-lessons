package ru.homework.lesson6.zoo;

public class Animals {

    protected String type;
    protected String name;
    protected String color;


    public Animals (String name, String color, String type) {

        this.type = type;
        this.name = name;
        this.color = color;

    }

    public void toRun (int lenghtOfTheObstacle) {
        System.out.printf(" %s %s  %s run to street " + lenghtOfTheObstacle + " meters\n", color, type, name);
    }

    public void toSwim (int lenghtOfTheObstacle) {
        System.out.printf(" %s %s  %s swim " + lenghtOfTheObstacle + " meters\n", color,type, name);
    }


}
