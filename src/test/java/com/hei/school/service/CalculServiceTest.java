package com.hei.school.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class CalculServiceTest {

  @InjectMocks private CalculService calculService;

  @Test
  void testAddPositiveNumber() {
    assertEquals(8, calculService.add(5, 3));
  }

  @Test
  void testAddNegativeNumber() {
    assertEquals(-1, calculService.add(2, -3));
  }

  @Test
  void testSubtractPositiveNumber() {
    assertEquals(4, calculService.sub(10, 6));
  }

  @Test
  void testSubtractNegativeNumber() {
    assertEquals(-11, calculService.sub(-5, 6));
  }

  @Test
  void testMultiplyPositiveNumber() {
    assertEquals(6, calculService.mul(3, 2));
  }

  @Test
  void testMultiplyNegativeNumber() {
    assertEquals(-10, calculService.mul(-5, 2));
  }

  @Test
  void testDividePositiveNumber() {
    assertEquals(5, calculService.div(10, 2));
  }

  @Test
  void testDivideNegativeNumber() {
    assertEquals(-3, calculService.div(-6, 2));
  }

  @Test
  void testDivideByZero() {
    assertThrows(ArithmeticException.class, () -> calculService.div(10, 0));
  }
  @Test
  void testAddWithZero() {
    assertEquals(5, calculService.add(5, 0));
    assertEquals(5, calculService.add(0, 5));
  }

  @Test
  void testMultiplyByZero() {
    assertEquals(0, calculService.mul(5, 0));
  }

  @Test
  void testDivideZeroByNumber() {
    assertEquals(0, calculService.div(0, 5));
  }
}
