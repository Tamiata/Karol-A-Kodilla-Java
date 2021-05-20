package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

class OddNumbersExterminator {
    List<Integer> list;

    public List<Integer> exterminate(List<Integer> list) {
        this.list = list;
        List<Integer> list2 = new LinkedList();
        for (Integer xxx: list) {
            if (xxx % 2 == 0) {
                list2.add(xxx);
            }
        }
        return list2;
    }
}

 /*class App {
    public static void main (String[] args) {

        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(83);
        list.add(40);
        list.add(65);
        list.add(9);
        list.add(23);
        list.add(46);
        list.add(32);
        list.add(13);
        list.add(63);

        System.out.println(list);

        OddNumbersExterminator m = new OddNumbersExterminator();
        m.exterminate(list);

        System.out.println(m.exterminate(list));
    }
} */