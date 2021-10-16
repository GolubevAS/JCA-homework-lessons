package ru.homework.firsttask;

public class Generzl {
    public static void main(String[] args) {

        Animals [] animals = {
                new Cat("Барсик", 12, 12),
                new Cat("Мурзик", 2, 9),
                new Cat("Борис", 4, 10),
                new Dog("Мопед", 1, 15),
                new Dog("Дитрих", 1, 15),
                new Dog("Белый Бим", 1, 15),
        };

        //олимпиада

        for (Animals x : animals) {
            x.toRun(200);
            x.toSwim(5);
        }

        // столовая

        Tarelka tarelka = new Tarelka(200);

        for (Animals a : animals) {
            a.eat(tarelka);
        }

        //пенсия
        for (Animals p : animals) {
            p.calculateYearsToRepence();
        }

        //сколько до выпускного
        for (Animals v : animals) {
           int yyeeaarrss = v.calculateYearsToVipusknoy();
            System.out.println("До выпуского осталось: "+ yyeeaarrss);
        }

        //геттеры и сеттеры
        Cat cat = new Cat("Dgorge", 1, 2);
        cat.setNastroenie(30000);
        System.out.println("Настроение вот такое - " + cat.getNastroenie());





    }
}
