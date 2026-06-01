package com.thealgorithms.searches;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the InterpolationSearch class.
 */
class InterpolationSearchTestWeak {


    /**
     * Test for interpolation search with an empty array.
     */
    @Test
    void testInterpolationSearchEmptyArray() {
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int[] array = {}; // Empty array
        int key = 3; // Key not present
        assertEquals(-1, interpolationSearch.find(array, key), "The element should not be found in an empty array.");
    }
    /**
     * Test for interpolation search when the element is in first position.
     */
    @Test
    void testInterpolationSearchFirstPosition() {
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int[] array = {73};
        int key = 73; // Element  present in the array
        assertEquals(0, interpolationSearch.find(array, key), "The index of the first element should be 0.");
    }

    /**
     * Test for interpolation search when the element is in middle position.
     */
    @Test
    void testInterpolationSearchMiddleElement() {
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int[] array = {1, 2, 3};
        int key = 0; // Key not present
        assertEquals(-1, interpolationSearch.find(array, key), "key is less than first element");
    }

    /**
     * Test for interpolation search when the element is in last position.
     */
    @Test
    void testInterpolationSearchLastElement() {
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int[] array = {1,1,4};
        int key = 5; // Key not present
        assertEquals(-1, interpolationSearch.find(array, key), "key is greater than last element");
    }
}
