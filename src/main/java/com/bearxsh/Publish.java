package com.bearxsh;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Publish {
    private static  String str = "ee";
    public static void main(String[] args) {
        Tee tee = new Tee();
        str = "dd";
    }
}
class Tee {
    public static Set<String> resultSet;
    private String[] states = new String[] {"1", "2", "3"};
    public void initialize() {
        resultSet = new HashSet<>();
    }
    public String[] getStates() {
        return states;
    }
}

class X {
    private final Lock rtl = new ReentrantLock();
    int value;
    public void addOne() {
        // 获取锁
        rtl.lock();
        try {
            value+=1;
        } finally {
            // 保证锁能释放
            rtl.unlock();
        }
    }
}

class Tes {

}