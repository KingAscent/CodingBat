/*
 * Given a string, return a version without both the first and last char of
 * the string. The string may be any length, including 0.
 */

public String withouEnd2(String str) {
  // Filter out strings that are of length 2 or less
  if(str.length() < 2)
    return "";
  return str.substring(1, str.length() - 1);
}
