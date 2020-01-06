package com.bearxsh;

public class Test3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(()-> {
                while (true) {
                    byte[] bytes = new byte[1024 * 1024];
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
