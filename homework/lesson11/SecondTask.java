package ru.homework.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondTask {

    public static <G> ArrayList<G> arrToList (G[] mass) {

        return new ArrayList<G>(Arrays.asList(mass));

  }
}
