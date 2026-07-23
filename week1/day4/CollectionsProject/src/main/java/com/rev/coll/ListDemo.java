package com.rev.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kevin");
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("Daniel");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

//        // list.remove("a");
//
//        System.out.println(list.contains("b"));
//        System.out.println(list);

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for(String lst: list) {
//            System.out.println(lst);
//        }
    }
}
