/*
 * Given a string, return a new string made of 3 copies of the first 2 chars of
 * the original string. The string may be any length. If there are fewer than
 * 2 chars, use whatever is there.
 */

public String extraFront(String str) {
  // Filter out strings with a length less than 2 and return the it as 3 copies
  if(str.length() < 2)
    return str + str + str;
  
  // Omit every char after the first 2, and then return the result as 3 copies
  str = str.substring(0, 2);
  return str + str + str;
}
