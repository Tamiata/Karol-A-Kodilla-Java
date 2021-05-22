package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> list) {

        List<Integer> list2 = new LinkedList();

        for (Integer numbers: list) {
            if (numbers % 2 == 0) {
                list2.add(numbers);
            }
        }
        return list2;
    }
}