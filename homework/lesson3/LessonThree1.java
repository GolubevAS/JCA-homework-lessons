package ru.homework.lesson3;

import java.util.Arrays;
import java.util.Random;


//First task

public class  LessonThree1 {
    public static void main (String ... args) {


        int n = 3;
        int arr [][] = new int[n][n];


        for (int i = 0; i < n; i++) {
                arr[i][i] = 1;
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%3d", arr[i][j]);
            System.out.println();
        }


        }
    }
