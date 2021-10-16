package ru.homework.lesson7;

public class Cat  {

    private String name;
    private int appetite;
    private boolean satiety;




    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat (Bowl bowl) {
        if (bowl.minusFood(appetite)) {
            System.out.printf("Кот %s  готов подкрепиться %d!\n", this.name, this.appetite);
            this.satiety = true;
            return true;
        }
        System.out.printf("Кот %s не поел, сейчас еды  %d , необходимо  %d еды!\n", this.name, this.appetite, bowl.getFoodAmount());
        return false;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}