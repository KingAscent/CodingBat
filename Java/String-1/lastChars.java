/*
 * Given 2 strings, a and b, return a new string made of the first char of a
 * and the last char of b, so "yo" and "java" yields "ya". If either string is
 * length 0, use '@' for its missing char.
 */

public String lastChars(String a, String b) {
  // Check if a or b are of string length 0
  if(a.length() == 0)
    a = "@";
  if(b.length() == 0)
    b = "@";
  
  // Isolate the character at the start of a and end of b
  a = Character.toString(a.charAt(0));
  b = Character.toString(b.charAt(b.length() - 1));
  
  return a + b;
}
