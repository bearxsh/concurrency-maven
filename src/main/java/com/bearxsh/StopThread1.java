package com.bearxsh;

import java.util.concurrent.TimeUnit;

public class StopThread1 {
    private static boolean stopRequested;

    private static synchronized void setStopRequested() {
        stopRequested = true;
    }

    private static synchronized boolean getStopRequested() {
        return stopRequested;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!getStopRequested()) {
                i++;
            }
        });
        backgroundThread.start();
        // 主线程休眠1s
        TimeUnit.SECONDS.sleep(1);
        setStopRequested();
    }
}
