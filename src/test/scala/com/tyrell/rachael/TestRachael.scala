package com.tyrell.rachael

import org.junit._
import Assert._

/**
 * Scala Test case example.
 */
class TestRachael {
  @Test
  def testVoice() {
    val rachael = new Rachael()
    assertNotNull(rachael.voice)
    assertEquals("Rachael", rachael.voice.name)
  }
}
