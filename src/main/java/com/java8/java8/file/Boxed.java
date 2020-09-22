package com.java8.java8.file;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Boxed {
    public static void main(String[] args) {
//        IntStream.range(0, 10).collect(Collectors.toList());
        IntStream.range(0,10).boxed().collect(Collectors.toList());
    }
}
