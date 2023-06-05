package com.andriiiiiko;

import java.util.Arrays;
import java.util.List;

public class NumberSorter {
    public static List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");

    public static void main(String[] args) {
        numbers.stream()
                .flatMap(n -> Arrays.stream(n.split(", ")))
                .mapToInt(Integer::parseInt)
                .sorted()
                .forEach(System.out::println);
    }
}