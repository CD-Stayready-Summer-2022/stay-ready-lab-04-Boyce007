package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codedifferently.SequentialSearchExample.sequentialSearch;

public class SequentialSearchTest {
    @Test
    @DisplayName("Sequentisl Search Test True")
    public void sequentialSearchTest() {
        int[] numbers = {1,2,3,4,5};
        Assertions.assertTrue(sequentialSearch(numbers,5));
    }
    @Test
    @DisplayName("Sequentisl Search Test False")
    public void sequentialSearchTest02() {
        int[] numbers = {1,2,3,4,5};
        Assertions.assertFalse(sequentialSearch(numbers,9));
    }


}
