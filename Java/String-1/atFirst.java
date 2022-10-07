/*
 * Given a string, return a string length 2 made of its first 2 chars. If
 * the string length is less than 2, use '@' for the missing chars.
 */

public String atFirst(String str) {
  // Checks if str is of length 1 or less
  if(str.length() < 2){
    // If str is of length 1, return it followed by an @
    if(str.length() == 1)
      return str + "@";
    // If str is of length 0, return @@
    return "@@";
  }
  // If str is of length 2 or more, return the first 2 chars
  return str.substring(0, 2);
}
