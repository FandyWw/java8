package com.java8.java8.file;

import java.util.stream.LongStream;

public class RangeClosed {
    public static void rangedTest() {
        LongStream ls = LongStream.range(2L, 5L);
        long[] lsA = ls.toArray();
        for (long l : lsA) {
            System.out.println(l);
        }
    }

    public static void rangedClosedTest() {
        LongStream ls = LongStream.rangeClosed(2L, 5L);
        long[] lsA = ls.toArray();
        for (long l : lsA) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        rangedTest();
        System.out.println("=================================");
        rangedClosedTest();
    }
}
