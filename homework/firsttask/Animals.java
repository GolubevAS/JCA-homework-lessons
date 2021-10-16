package ru.homework.firsttask;



public class Animals {

    private String type;
    private String name;
    private int age;
    private int appetite;
    private int nastroenie;

    public Animals(String type, String name, int age, int appetite) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.appetite = appetite;
    }


    //пенсия без возвращаемого значения
    void calculateYearsToRepence () {
        int years = 65 - getAge();
        System.out.printf("Этому %s %s осталось " + years + " лет до пенсии\n", getType(), getName());
    }

    //с возвращаемым значением
    int calculateYearsToVipusknoy () {
        int years = 18 - getAge();
        return years;
    }



    //столовая
    public void eat (Tarelka tarelka) {
        System.out.printf("%s %s готов подкрепиться\n", type, name);
    }

    //олимпиада
    public void toRun (int lenghtOfTheObstacle) {
            System.out.printf("The cat run that much\n");
        }

    public void toSwim (int lenghtOfTheObstacle) {
        System.out.printf("The swim\n ");
    }





    // Get and Set and toString

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setNastroenie(int nastroenie) {
        this.nastroenie = nastroenie;
    }

    public int getNastroenie() {
        return nastroenie;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", appetite=" + appetite +
                ", nastroenie=" + nastroenie +
                '}';
    }
}
