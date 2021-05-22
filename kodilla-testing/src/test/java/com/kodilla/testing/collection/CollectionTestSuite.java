package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.*;


public class CollectionTestSuite {
    @DisplayName (
            "When creating empty list, the result should also be empty." +
            "When creating list with numbers: 42, 3, 15, 90, 18, the result shoud be 42, 90, 18."
    )
    @BeforeEach
    public void before() {
        System.out.println("Test Case: starting test");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: test has been finished");
    }

    @Test
    void testOddNumbersExterminatorEmptyList() {

        List<Integer> emptyList = new LinkedList<>();
        List<Integer> expectedResult = new LinkedList<>();

        OddNumbersExterminator m = new OddNumbersExterminator();
        List<Integer> result = m.exterminate(emptyList);

        Assertions.assertEquals(expectedResult, result);
    }
    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> list = new LinkedList<>();
        list.add(42);
        list.add(3);
        list.add(15);
        list.add(90);
        list.add(18);

        List<Integer> expectedResult = new LinkedList<>();
        expectedResult.add(42);
        expectedResult.add(90);
        expectedResult.add(18);

        OddNumbersExterminator n = new OddNumbersExterminator();
        List<Integer> result = n.exterminate(list);

        Assertions.assertEquals(expectedResult, result);

    }

}

