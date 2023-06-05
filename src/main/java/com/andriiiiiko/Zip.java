package com.andriiiiiko;

import java.util.stream.Stream;
import java.util.Iterator;

public class Zip {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> second = Stream.of(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        Stream<Integer> result = zip(first, second);
        result.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            builder.add(iteratorFirst.next());
            builder.add(iteratorSecond.next());
        }
        return builder.build();
    }
}