package ru.homework.lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Words {

    private static final String wordsList =
            "green " +
                    "blue " +
                    "blue " +
                    "blue " +
                    "red " +
                    "black";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }



    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();


        for (String s : arr) {
            map.merge(s, 1, Integer::sum);

        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(wordsList.toLowerCase().split(" ")));
        System.out.println(getWordsCount(wordsList.toLowerCase().split(" ")));


        Phonebook phonebook = new Phonebook();
        phonebook.add("Dostoevskiy", "8787787878");
        phonebook.add("Puskin", "8787787878");
        phonebook.add("Puskin", "89996669999");
        phonebook.add("Puskin", "8787787878");
        phonebook.add("Gogol'", "8787787878");
        phonebook.add("Dostoevskiy", "8787787878");
        phonebook.add("Dostoevskiy", "8787787878");
        phonebook.add("Dostoevskiy", "8787787878");
        phonebook.add("Ivanov", "8787787878");



        System.out.println("phone Dostoevskiy: " + phonebook.get("Dostoevskiy"));
        System.out.println("phone Puskin: " + phonebook.get("Puskin"));

    }


    }
