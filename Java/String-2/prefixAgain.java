/*
 * Given a string, consider the prefix string made of the first N chars of the
 * string. Does that prefix string appear somewhere else in the string? Assume
 * that the string is not empty and that N is in the range 1..str.length().
 */

public boolean prefixAgain(String str, int n) {
  // Find what the substring of (0, n) is
  String front = str.substring(0, n);
  
  // Find if somewhere else in the string, the front appears
  for(int i = n; i <= str.length() - n; i++){
    if(str.substring(i, i + n).equals(front))
      return true;
  }
  
  return false;
}
