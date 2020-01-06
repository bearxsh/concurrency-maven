package com.bearxsh;

import java.util.concurrent.atomic.AtomicLong;

public class Student {
    // 库存上限
    private final AtomicLong upper =
            new AtomicLong(0);
    // 库存下限
    private final AtomicLong lower =
            new AtomicLong(0);

    private final StringBuffer name = new StringBuffer();
    // 设置库存上限
    void setUpper(long v){
        upper.set(v);
    }
    // 设置库存下限
    void setLower(long v){
        lower.set(v);
    }
    // 省略其他业务代码
    public void setName(String name) {
        this.name.append(name);
    }

}

