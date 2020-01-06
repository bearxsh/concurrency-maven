package com.bearxsh;

public class Mutex {
    public static void main(String[] args) {
        M m = new M();
        new Thread(new Runnable() {
            @Override
            public void run() {
                m.doSomething();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                m.doSomething();
            }
        }).start();
    }
}

class M {
    private volatile int mutex = 1;
    public void doSomething() {
            while (mutex > 0) {
                mutex--;
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
                mutex++;
            }

    }
}