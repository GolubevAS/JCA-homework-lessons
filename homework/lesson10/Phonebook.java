package ru.homework.lesson10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {

    private final Map<String, Set<String>> records = new TreeMap<>();

    public void add(String name, String phoneNumber) {
        Set<String> phones = getPhones(name);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String name) {
        return records.computeIfAbsent(name, key -> new HashSet<>());

    }

    public Set<String> get(String name) {
        return getPhones(name);
    }

    public Set<String> getAllSurnames() {
        return records.keySet();
    }

}

