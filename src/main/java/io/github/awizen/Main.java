package io.github.awizen;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("ala", "ma", "kota");
        var build = Stream.<String>builder().build();
        var generate = Stream.generate(() -> "Hello");
        boolean b = generate.allMatch(w -> w.length() == 5);
        System.out.println(b);
        System.out.println(b);

    }
}
