/*
 * Given a string of odd length, return the string length 3 from its middle,
 * so "Candy" yields "and". The string length will be at least 3.
 */

public String middleThree(String str) {
  // Dividing an odd number results in a rounding down value
  // Such that: 5/2 yields 2 with a remainder of 1, or just 2
  int middle = str.length() / 2;
  return str.substring(middle - 1, middle + 2);
}
