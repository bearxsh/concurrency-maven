package com.bearxsh;

import java.util.ArrayList;
import java.util.List;

public class OOMTest {
    public static void main(String[] args) {
        List<Sea> seaList = new ArrayList<>();
        while (true) {
            seaList.add(new Sea());
        }
    }
}
class Sea {
    private byte[] bytes = new byte[256 * 1024];
}