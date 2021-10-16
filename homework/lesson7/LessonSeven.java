package ru.homework.lesson7;

public class LessonSeven {
    public static void main(String[] args) {

        Cat [] cats = {
                new Cat("Мурзик", 10),
                new Cat("Барсик", 15),
                new Cat("Васька", 40),
        };

        Bowl bowl = new Bowl( 0);
        bowl.plusFoodIntoBowl(40);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("В итоге осталось в миске: " +  bowl.getFoodAmount());

        for (Cat cat : cats) {
            System.out.println(cat);;
        }


}}
