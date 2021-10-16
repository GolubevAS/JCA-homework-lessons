package ru.homework.firsttask;



public class Dog extends Animals {

    Dog (String name, int age, int appetite) {
        super ("dog", name, age, appetite);
    }


    //процесс еды
    public void eat (Tarelka tarelka) {
        System.out.printf("Собачка %s готова подкрепиться\n", this.getName());
        tarelka.minusFood(this.getAppetite());
        System.out.printf("Собачка %s покушала!!!\n", this.getName());
    }

    //sport
    @Override
    public void toRun (int lenghtOfTheObstacle) {
        if (lenghtOfTheObstacle < 300) {
            System.out.printf(" %s  %s run to street " + lenghtOfTheObstacle + " meters\n", getType(), getName());
        } else {
            System.out.printf("The %s  %s cannot run that much\n",  getType(), getName());
        }
    }

    @Override
    public void toSwim (int lenghtOfTheObstacle) {
        if (lenghtOfTheObstacle < 20) {
            System.out.printf(" %s  %s sweem to street " + lenghtOfTheObstacle + " meters\n", getType(), getName());
        } else {
            System.out.printf("The %s  %s cannot sweem that much\n",  getType(), getName());
        }
    }




}
