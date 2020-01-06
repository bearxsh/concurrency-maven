package com.bearxsh;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = null;
        System.out.println(list1 == null);
        System.out.println(list1.size());
        //System.out.println(list2.size());
        System.out.println(CollectionUtils.isEmpty(list1));
        Collections.emptyList();

    }
}
