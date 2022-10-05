/*
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 */

public boolean mixStart(String str) {
  return (3 <= str.length() && str.substring(1, 3).equals("ix"));
}
