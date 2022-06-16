package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.codedifferently.SortExample.bubbleSort;

public class SortExampleTest {
    @Test
    @DisplayName("Selection Sort Test")
    public void selectionSortTest() {
        int[] numbers = {3, 2, 1};
        int[] expected = {1, 2, 3};
        int[] actual = SortExample.selectionSort(numbers);
        Assertions.assertTrue(Arrays.equals(expected, actual));

    }

    @Test
    @DisplayName("Bubble Sort Test ")
    public void bubbleSortTest() {
        int[] numbers = {3, 5, 1, 8, 6};
        int[] expected = {1, 3, 5, 6, 8};
        int[] actual = bubbleSort(numbers);
        Assertions.assertArrayEquals(expected, actual);

    }

}
