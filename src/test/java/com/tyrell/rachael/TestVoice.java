package com.tyrell.rachael;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit 4 tests in Java
 */
public class TestVoice {
  @Test
  public void testName() {
    Voice v = new Voice();

    assertEquals("Rachael", v.name());
  }
}
