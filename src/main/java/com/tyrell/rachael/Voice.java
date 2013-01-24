package com.tyrell.rachael;

/**
 * An example Java class.
 */
public class Voice {
  public void say(String s) {
    System.out.println("Rachael says " + s);
  }

  @Override
  public String toString() {
    return "Rachael's Voice Interface";
  }

  public String name() {
    return "Rachael";
  }
}
