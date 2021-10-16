package ru.homework.firsttask;



public class Cat extends Animals {

    Cat (String name, int age, int appetite) {
        super ("cat", name, age, appetite);
    }





    //процесс еды
    @Override
    public void eat (Tarelka tarelka) {
        System.out.printf("Котик %s готов подкрепиться\n", this.getName());
        tarelka.minusFood(this.getAppetite());
        System.out.printf("Котик %s покушал!!!\n", this.getName());
    }


    //sport
    @Override
    public void toRun (int lenghtOfTheObstacle) {
        if (lenghtOfTheObstacle < 200) {
            System.out.printf(" %s  %s run to street " + lenghtOfTheObstacle + " meters\n", getType(), getName());
        } else {
            System.out.printf("The %s  %s cannot run that much\n",  getType(), getName());
        }
    }

    @Override
    public void toSwim (int lenghtOfTheObstacle) {
        System.out.printf("The %s  %s can't swim\n ", getType(), getName());
    }




}
