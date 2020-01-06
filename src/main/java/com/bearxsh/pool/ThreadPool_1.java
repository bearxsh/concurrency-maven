package com.bearxsh.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool_1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 7, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        for (int i = 0; i < 10; i++) {
            poolExecutor.execute(myThread);
        }
    }

}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}