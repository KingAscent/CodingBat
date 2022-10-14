/*
 * Given two strings, return true if either of the strings appears at the
 * very end of the other string, ignoring upper/lower case differences
 * (in other words, the computation should not be "case sensitive").
 * Note: str.toLowerCase() returns the lowercase version of a string.
 */

public boolean endOther(String a, String b) {
  // Find which string is shorter to know which string to search for
  int shorter = Math.min(a.length(), b.length());
  
  // Check to see if a string appears at the end of the other
  return (a.substring(a.length() - shorter).equalsIgnoreCase(b) ||
          b.substring(b.length() - shorter).equalsIgnoreCase(a));
}
