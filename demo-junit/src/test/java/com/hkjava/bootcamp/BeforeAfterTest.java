package com.hkjava.bootcamp;

import org.junit.jupiter.api.Test;

public class BeforeAfterTest {

  private int x;

  @Test
  @BeforeEach
  void beforeEach() {
    assertEquals(0, this.x);
    x += 3;
  }

  @AfterEach
  void endOfTest() {
    this.x -= 2;
  }

  @Test
  void testAdd() {
    assertEquals(8, App.add(this.x, 5));
  }

  @Test
  void testAdd2() {
    assertEquals(8, App.add(this.x, 5));
  }

}
