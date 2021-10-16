package ru.homework.lesson13;

public class General {
    public static void main(String[] args) {
        Race race = new Race(6,
                new Road(35),
                new Tunnel(35, 3),
                new Road(43),
                new Tunnel(10, 3),
                new Road(90),
                new Road(30));
        race.makeRace();
    }
}
