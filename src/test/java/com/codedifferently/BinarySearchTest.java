package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    @DisplayName("Binary Search Test")
    public void binarySearchTest() {
        int[] numbers = {1,2,3,4,5};
        Boolean actual = BinarySearch.binarySearch(numbers,3);
        Assertions.assertTrue(actual);
    }

}
