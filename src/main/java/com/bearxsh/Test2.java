package com.bearxsh;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("hh");
            System.out.println("dd");
        }).start();
        new Thread(() -> {
            System.out.println("didi");
            System.out.println("hello world!");
        }).start();
        List<String> list = Arrays.asList("1", "2", "3");
        for (String element : list) {
            System.out.println(element);
        }
        list.forEach(element -> System.out.println(element));
    }
}
