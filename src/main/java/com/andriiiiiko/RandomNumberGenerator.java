package com.andriiiiiko;

import java.util.stream.Stream;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = System.currentTimeMillis();

        Stream<Long> randomNumbers = generateRandomNumbers(a, c, m, seed);
        randomNumbers.limit(5454).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}