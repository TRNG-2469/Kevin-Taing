package com.rev.coll;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Frank");
        set.add("Kevin");
        set.add("Diana");
        set.add("Adam");
        set.add("Kevin");

        System.out.println(set);
    }
}
