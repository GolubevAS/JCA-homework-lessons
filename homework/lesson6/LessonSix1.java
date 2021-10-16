package ru.homework.lesson6;

import ru.homework.lesson6.zoo.Cat;
import ru.homework.lesson6.zoo.Dog;

public class LessonSix1 {
    public static void main (String... args) {
        Cat cat = new Cat("Vasika", "red");
        Dog dog = new Dog("Tuzik", "black");

        cat.toRun(1000);
        dog.toRun(400);
        cat.toSwim(30);
        dog.toSwim(9);


    }
}
