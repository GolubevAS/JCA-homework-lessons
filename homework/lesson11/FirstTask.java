package ru.homework.lesson11;

public class FirstTask {

    public static void twoElements (Object[] mass, int n1, int n2) {
        Object a = mass[n1];
        mass[n1] = mass[n2];
        mass[n2] = a;

    }
}
