package com.bearxsh;

import java.util.concurrent.TimeUnit;

public class StopThread3 {
    public static void main(String[] args) throws InterruptedException {
        GoodJob goodJob = new GoodJob();
        new Thread(() -> {
            int i = 0;
            while (!goodJob.getAlive()) {
                i++;
            }
        }).start();
        // 主线程休眠1s
        TimeUnit.SECONDS.sleep(1);
        goodJob.setAlive(true);
    }
}

class GoodJob {
    private volatile boolean alive;

    public boolean getAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}