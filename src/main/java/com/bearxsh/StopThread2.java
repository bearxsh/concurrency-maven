package com.bearxsh;

import java.util.concurrent.TimeUnit;

public class StopThread2 {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            while (!stopRequested) {
                System.out.println("running...");
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
