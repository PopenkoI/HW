package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFunctionTest {
    MyFunction func;

    @BeforeAll
    public void parametrs() {
        func = new MyFunction();
    }

    @Test
    void allBelongToRangeTestAllBelong() {
        assertTrue(func.allBelongToRangeOrNot(-1, 0, 3));
    }

    @Test
    void allBelongToRangeTestAllDoNotBelong() {
        assertFalse(func.allBelongToRangeOrNot(-6, 10, 7));
    }

    @Test
    void allBelongToRangeTestAtTheEndBelong() {
        assertTrue(func.allBelongToRangeOrNot(5, -5, 3));
    }

    @Test
    void allBelongToRangeTestAtTheEndDoNotBelong() {
        assertFalse(func.allBelongToRangeOrNot(5, -5, 6));
    }

    @Test
    void allBelongToRangeTestAtTheLimitDoNotBelong() {
        assertFalse(func.allBelongToRangeOrNot(5.001f, -5, 3));
    }

    @Test
    void allBelongToRangeOrNotTestAllTheSame() {
        assertTrue(func.allBelongToRangeOrNot(5, 5, 5));
    }


    @Test
    void maxOfThreeNumbersOneMaxPositive() {
        assertEquals(3, func.maxOfThreeNumbers(1, 2, 3));
    }

    @Test
    void maxOfThreeNumbersTwoMaxPositive() {
        assertEquals(3, func.maxOfThreeNumbers(3, 2, 3));
    }

    @Test
    void maxOfThreeNumbersOneMaxNegative() {
        assertEquals(-1, func.maxOfThreeNumbers(-3, -1, -7));
    }

    @Test
    void maxOfThreeNumbersTwoMaxNegative() {
        assertEquals(-1, func.maxOfThreeNumbers(-1, -1, -7));
    }

    @Test
    void maxOfThreeNumbersNegativeAndPositive() {
        assertEquals(1, func.maxOfThreeNumbers(1, 2, -3));
    }

    @Test
    void minOfThreeNumbersOneMinPositive() {
        assertEquals(1, func.minOfThreeNumbers(1, 2, 3));
    }

    @Test
    void minOfThreeNumbersTwoMinPositive() {
        assertEquals(1, func.minOfThreeNumbers(1, 5, 1));
    }

    @Test
    void minOfThreeNumbersOneMinNegative() {
        assertEquals(-2, func.minOfThreeNumbers(-1, -2, -2));
    }

    @Test
    void minOfThreeNumbersTwoMinNegative() {
        assertEquals(-7, func.minOfThreeNumbers(-7, -2, -7));
    }

    @Test
    void minOfThreeNumbersNegativeAndPositive() {
        assertEquals(-3, func.minOfThreeNumbers(-1, 2, -3));
    }

}