package ru.homework.lesson4;


import java.util.Random;
import java.util.Scanner;

public class LessonFour1 {

    //tic-tac-toe

    // вспомогательные элементы
    private static Scanner SCANNER = new Scanner(System.in);
    private static Random RANDOM = new Random();

    // участники игры
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static int scoreHuman;
    private static int scoreAI;
    private static int roundCounter = 1;
    private static int winLenght = 3;

    // поле
    private static char [][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    // метод мейн
    public static void main(String[] args) {
        play();



    }


    // инициализация поля + печать поля
    public static void fieldInit (int sizeY, int sizeX) {
        fieldSizeX = sizeX;
        fieldSizeY = sizeY;

        field = new char [sizeY][sizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field [y][x] = DOT_EMPTY;
            }
        }

    }

    static void printField () {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1 ; i++) {
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



    // игровой процесс

    private static void play () {
        while (true) {
        playRound();
        System.out.printf("Round is over! SCORE: HUMAN    AI \n" +
                          "                        %d      %d \n", scoreHuman, scoreAI);
        System.out.printf("Want to play again? Please enter Y or N? >>>>>");
        if (!SCANNER.next().toLowerCase().equals("y")) {
            System.out.println("GAME OVER!");
            break;
        }
        }

    }

    private static void playRound () {
        System.out.printf("ROUND %d\n", roundCounter++);
        fieldInit(3, 3);
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkGame(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkGame(DOT_AI)) break;
        }

    }


    // ход игрока и противника
    private static void humanTurn () {
        int x, y;

        do {
            System.out.println("Please enter your smart number >>>>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!cellEmpty(y, x) || !cellValid(y, x));

        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurnEasy () {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!cellEmpty(y,x));

        field[y][x] = DOT_AI;
    }

    // продвинутый ход компа
    private static void aiTurn () {
        for (int i = 0; winLenght - i > 2; i++) {
            if (scanField(DOT_AI, winLenght - i)) return;
            if (scanField(DOT_HUMAN, winLenght - i)) return;
        }
       aiTurnEasy();
    }

    // логика компа 2.0
    private static boolean  scanField (char dot, int lenght) {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (cellEmpty(y, x)) {
                    field[y][x] = dot;
                    if (checkWin(dot, lenght)) {
                        if (dot == DOT_AI) return true;
                        if (dot == DOT_HUMAN) {
                            field [y][x] =DOT_AI;
                            return true;
                        }
                    }
                    field [y][x] =DOT_EMPTY;
                }
            }
            }
        return false;
    }


    // итоги игры: win + draw + ...

    private static boolean checkWin (char dot, int lenght) {
        for (int y = 0; y < fieldSizeY; y++) {   // проверяем все поле
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkLine(x, y, 1, 0, lenght, dot)) return true; // проверка по +х
                if (checkLine(x, y, 1, 1, lenght, dot)) return true; // проверка по + х +у
                if (checkLine(x, y, 0, 1, lenght, dot)) return true; // проверка по +х
                if (checkLine(x, y, 1, -1, lenght, dot)) return true; // проверка по +х - у
            }
        }
        return false;
    }


   // проверка линии
    private static boolean checkLine (int x, int y, int incrementX, int incrementY, int len, int dot) {
        int endXline = x + (len -1) * incrementX; // конец по линии Х
        int endYline = y + (len -1) * incrementY; // конец по линии У
        if (!cellValid(endYline, endXline)) return false; // выход за пределы поля
        for (int i = 0; i < len; i++) {     // идем по линии
            if (field [y + i * incrementY][x + i * incrementX] != dot) return false;
        }
        return true;
    }

    //ничья
    private static boolean checkDraw () {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (cellEmpty (y, x)) return false;
            }
        }
        System.out.println("DRAW!!!");
        return true;
    }


    private static boolean checkGame (char dot) {
        if (checkDraw()) return true;
        if (checkWin(dot, winLenght)) {
            if (dot == DOT_HUMAN) {
                System.out.println("Human wins! Great!");
                scoreHuman++;
            } else {
                System.out.println("AI wins! Sorry!");
                scoreAI++;
            } return true;
        } return false;
    }



    // проверка ходов игроков

    private static boolean cellEmpty (int y, int x) {
              return field [y][x] == DOT_EMPTY;
    }

    private static boolean cellValid (int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }



}

