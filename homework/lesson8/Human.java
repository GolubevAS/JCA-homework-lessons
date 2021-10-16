package ru.homework.lesson8;

public class Human implements User {

    String name;
    private int maxRun;
    private int maxJump;

    Human ( String name, int maxRun,int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public boolean run (int lenght) {
        return this.maxRun >= lenght;
    };

    @Override
    public boolean jump (int height) {
        return this.maxJump >= height;
    };

    public String getName() {
        return this.name;
    }

//    @Override
//    public boolean win(User user) {
//        return false;
//    }


}
