package com.hei.school.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculServiceTest {

    @Test
    void testAddPositiveNumber() {
        CalculService calculService = new CalculService();
        assertEquals(8, calculService.add(5, 3));
    }

    @Test
    void testAddNegativeNumber() {
        CalculService calculService = new CalculService();
        assertEquals(-1 ,calculService.add(2, -3));
    }

    @Test
    void testSubtractPositiveNumber() {
        CalculService calculService = new CalculService();
        assertEquals(4,calculService.sub(10,6) );
    }

    @Test
    void testSubtractNegativeNumber() {
        CalculService calculService = new CalculService();
        assertEquals(-11 ,calculService.sub(-5,6) );
    }

    @Test
    void testMultiplyPositiveNumber() {
        CalculService calculService = new CalculService();
        assertEquals(6,calculService.mul(3,2));
    }

    @Test
    void testMultiplyNegativeNumber() {
        CalculService calculService = new CalculService();
        assertEquals(-10 ,calculService.mul(-5,2));
    }

    @Test
    void testDividePositiveNumber() {
        CalculService calculService = new CalculService();
        assertEquals(5,calculService.div(10,2));
    }

    @Test
    void testDivideNegativeNumber() {
        CalculService calculService = new CalculService();
        assertEquals(-3 ,calculService.div(-6,2));
    }
}
