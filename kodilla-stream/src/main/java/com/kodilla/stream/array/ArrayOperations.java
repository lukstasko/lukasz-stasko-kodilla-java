package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverange(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        double averange = IntStream.range(0, numbers.length)
                .average().getAsDouble();
        return averange;
    }
}
