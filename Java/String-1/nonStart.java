/*
 * Given 2 strings, return their concatenation, except omit the first char
 * of each. The strings will be at least length 1.
 */

public String nonStart(String a, String b) {
  // substring(1) will return every character starting at index 1
  return a.substring(1) + b.substring(1);
}
