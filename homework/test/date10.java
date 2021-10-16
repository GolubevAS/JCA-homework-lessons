package ru.homework.test;

import java.util.Random;
import java.util.Scanner;

public class date10 {

    //вспомогательные элементы
   private static final Scanner SCANNER = new Scanner(System.in);
   private static final Random RANDOM = new Random();

    // сначала делаем игровое поле
    private static char [][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;


    // инициализируем игроков
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static int scoreHuman;
    private static int scoreAI;
    private static int roundCounter = 1;

    public static void main(String[] args) {
      //play();





    }


    // игровой процесс







    // тут будем писать все наши методы для игры
    // ПОЛЕ
    //с чего мы должны начать? запросить размер и заполнить поле точками


    //метод печати нашего поля
    static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();


    }


    // ПРОЦЕСС ИГРЫ
    //надо спросить человека куда он хочет походить?



    //надо спросить AI куда он хочет походить?



    //ИТОГИ ИГРЫ
    // проверка победы (по горизонтали и вертикали и диагонали)
    private static boolean chekWin(char dot) {
        //горизонтали
        if (field [0][0] == dot && field [1][0] == dot && field [2][0] == dot) return true;
        if (field [0][1] == dot && field [1][1] == dot && field [2][1] == dot) return true;
        if (field [0][2] == dot && field [1][2] == dot && field [2][2] == dot) return true;

        // вертикали
        if (field [0][0] == dot && field [0][1] == dot && field [0][2] == dot) return true;
        if (field [1][0] == dot && field [1][1] == dot && field [1][2] == dot) return true;
        if (field [2][0] == dot && field [2][1] == dot && field [2][2] == dot) return true;

        // диагонали
        if (field [0][0] == dot && field [1][1] == dot && field [2][2] == dot) return true;
        if (field [0][2] == dot && field [1][1] == dot && field [2][0] == dot) return true;
        return false;
    }

    // если ничья


    // итоги игры




    // ПРОВЕРКИ
    //надо проверить что поле не занято


    // защита от "дурака", чтоб не вводил не те числа



}








