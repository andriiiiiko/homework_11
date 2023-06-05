package com.andriiiiiko;

import java.util.*;
import java.util.function.Predicate;

public class NameSorter {
    private static List<String> names = Arrays.asList("Ivan", "Petro", "Olena", "Mariya", "Maksym", "Sofiya",
            "Nataliya", "Oleksandr", "Yuliya", "Viktoriya", "Andrii", "Lyudmyla", "Oleg", "Kateryna", "Anastasiya");

    public static void main(String[] args) {
        List<String> oddNames = checkName(names, name -> names.indexOf(name) % 2 != 0);
        System.out.println("Odd names: " + oddNames);

        Collections.sort(names, (n1, n2) -> n2.toUpperCase().compareTo(n1.toUpperCase()));
        System.out.println("Sorted names: " + names);
    }

    private static List<String> checkName(List<String> names, Predicate<String> function) {
        List<String> result = new ArrayList<>();
        for(String name : names) {
            if(function.test(name)) {
                result.add(name);
            }
        }
        return result;
    }
}