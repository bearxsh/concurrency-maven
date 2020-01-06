package com.bearxsh;

import java.util.Objects;

public class JudgeObjectNullExample {
    public static void main(String[] args) {
        String str1 = new String("hello world");
        String str2 = null;
        System.out.println(Objects.isNull(str1));
        System.out.println(Objects.nonNull(str1));
        System.out.println(Objects.isNull(str2));
        System.out.println(Objects.nonNull(str2));
    }
}
