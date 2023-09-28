package com.hkjava.bootcamp;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.apiTestInstance;

@TestInstance(TesInstance.Lifecycle.Per_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class PerClassTest {
  private int x;

  @Test
  @Order(2)
  void test1() {
    x++;
    assertEquals(1, x);
  }

  @Test
  @Order(1)
  void test2() {
    x++;
    assertEquals(1, x);
  }

  @Test
  void testAssertTrue() {
    assertTrue(5 > App.add(7, 5));
  }

  @Test
  void testAssertNull(){
    String str = null;
    assertNull(str);
  }
}
