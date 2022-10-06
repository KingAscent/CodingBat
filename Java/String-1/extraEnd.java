/*
 * Given a string, return a new string made of 3 copies of
 * the last 2 chars of the original string. The string length will be at least 2.
 */

public String extraEnd(String str) {
  // For clarity, one could also use str.substring(str.length() - 2, , str.length())
  String last2 = str.substring(str.length() - 2);
  return last2 + last2 + last2;
}
