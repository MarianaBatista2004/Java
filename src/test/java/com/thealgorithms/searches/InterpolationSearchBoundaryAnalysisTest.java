package com.thealgorithms.searches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the InterpolationSearch class.
 */
class InterpolationSearchBoundaryAnalysisTest {

    private final InterpolationSearch interpolationSearch = new InterpolationSearch();

    private int[] createArray(int size, int startValue) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = startValue + i;
        }
        return array;
    }

    /**
     * TC01: Array Size = 0, Key = 0 -> Expected = -1
     */
    @Test
    void testTC01_EmptyArray() {
        int[] array = {};
        int key = 0;
        assertEquals(-1, interpolationSearch.find(array, key), "key is not found in empty array");
    }

    /**
     * TC02: Array Size = 1, Key = 0 -> Expected = 0
     */
    @Test
    void testTC02_SingleElementFound() {
        int[] array = {0};
        int key = 0;
        assertEquals(0, interpolationSearch.find(array, key), "key is equal to first element");
    }

    /**
     * TC03: Array Size = 201, Key = 0 -> Expected = 0
     */
    @Test
    void testTC03_LargeArrayFirstElement() {
        int[] array = createArray(201, 0);
        int key = 0;
        assertEquals(0, interpolationSearch.find(array, key), "key is equal to first element");
    }

    /**
     * TC04: Array Size = 200, Key = 0 -> Expected = 0
     */
    @Test
    void testTC04_BoundaryArrayFirstElement() {
        int[] array = createArray(200, 0);
        int key = 0;
        assertEquals(0, interpolationSearch.find(array, key), "key is equal to first element");
    }

    /**
     * TC05: Array Size = 100, Key = -100 -> Expected = 0
     */
    @Test
    void testTC05_NegativeBoundaryFirstElement() {
        int[] array = createArray(100, -100);
        int key = -100;
        assertEquals(0, interpolationSearch.find(array, key), "key is equal to first element");
    }

    /**
     * TC06: Array Size = 100, Key = -99 -> Expected = 1
     * Nota: Mantendo a mesma lógica do TC05, se começar em -100, o -99 estará no índice 1.
     */
    @Test
    void testTC06_NegativeBoundarySecondElement() {
        int[] array = createArray(100, -100);
        int key = -99;
        assertEquals(1, interpolationSearch.find(array, key), "key is after first element");
    }

    /**
     * TC07: Array Size = 100, Key = 99 -> Expected = -1
     */
    @Test
    void testTC07_KeyLessThanArrayRange() {
        int[] array = createArray(100, 100);
        int key = 99;
        assertEquals(-1, interpolationSearch.find(array, key), "key is less than first element");
    }

    /**
     * TC08: Array Size = 100, Key = 100 -> Expected = -1
     */
    @Test
    void testTC08_KeyGreaterThanArrayRange() {
        int[] array = createArray(100, 0);
        int key = 100;
        assertEquals(-1, interpolationSearch.find(array, key), "key is greater than last element");
    }

    /**
     * TC09: Array Size = 100, Key = 0 -> Expected = -1
     */
    @Test
    void testTC09_KeyNotFoundInMiddle() {
        int[] array = createArray(100, 1);
        int key = 0;
        assertEquals(-1, interpolationSearch.find(array, key), "key is less than first element");
    }

}
