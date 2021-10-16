//package ru.homework.lesson11;
//
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Box <F extends Fruit> {
//    private List <F> fruits;
//
//
//    public Box (F... fruits) {
//        this.fruits = new ArrayList<>(Arrays.asList(fruits));
//    }
//
//    public Box (List<F> fruits) {
//        this.fruits = new ArrayList<>(fruits);
//    }
//
//    public Box () {
//        this.fruits = new ArrayList<>();
//    }
//
//    public void add (F fruit) {
//        this.fruits.add(fruit);
//    }
//
//    public double getWeight () {
//        double weight = 0.0;
//        for (F fruit : fruits) {
//            weight += fruit.getWeight();
//        }
//        return weight;
//    }
//
//    public boolean equalsWeight (Box<?> another) {
//        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
//    }
//
//    public void tranferAll (Box<? super F> another) {
//        if (this == another) return;
//        another.fruits.addAll(fruits);
//        fruits.clear;
//    }
//
//    public List <F> getFruits () {
//        return fruits;
//    }
//
//
//}
