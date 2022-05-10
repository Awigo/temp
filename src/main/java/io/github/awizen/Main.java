package io.github.awizen;

import java.util.Arrays;
import java.util.Optional;

class Main {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> ala = Optional.of("ala");
        System.out.println(empty.isEmpty());
        empty = ala;
        System.out.println(empty.isEmpty());
    }
}
