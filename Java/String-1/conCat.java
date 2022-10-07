/*
 * Given two strings, append them together (known as "concatenation") and
 * return the result. However, if the concatenation creates a double-char,
 * then omit one of the chars, so "abc" and "cat" yields "abcat".
 */

public String conCat(String a, String b) {
  // Check if either string is of length 0
  if(a.length() == 0)
    return b;
  if(b.length() == 0)
    return a;
  
  // Checks if the last char of a is the same as the first char of b
  if(a.charAt(a.length() - 1) == b.charAt(0))
    return a + b.substring(1);
  
  // If neither of the above cases are found, the strings appended together
  return a + b;
}
