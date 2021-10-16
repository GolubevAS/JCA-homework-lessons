package ru.homework.lesson8;

public class Lesson8 {
    public static void main(String[] args) {

        User [] users = {

                new Robot("T-1000", 99999, 99999),
                new Robot("T-800", 5000, 5000),
                new Cat("Prosto Cat", 150, 30),
                new Cat("Mur-Mur", 1700, 220),
                new Human("Fedor", 20, 150),
                new Human("Nicolay", 350, 120)
        };

        Barrier[] barriers = {
                new Treadmill(1200),
                new Wall(30),
                new Treadmill(2000),
                new Wall(140),
                new Treadmill(3000),
                new Wall( 250)
        };

        for (User u : users) {
            for (Barrier b : barriers) {
                if (!b.win(u)) break;
            }

        }




    }
}
