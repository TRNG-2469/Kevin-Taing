package com.rev.coll;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Jon", 10000);
        map.put("Surya", 11000);
        map.put("Daquan", 12000);
        map.put("Daniel", 13000);

        System.out.println(map);
    }
}
