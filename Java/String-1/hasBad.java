/*
 * Given a string, return true if "bad" appears starting at index 0 or 1 in
 * the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The
 * string may be any length, including 0. Note: use .equals() to compare
 * 2 strings.
 */

public boolean hasBad(String str) {
  // For checking if str is of length 3 or more, and checking if bad appears
  // starting at index 0
  if(3 <= str.length() && str.substring(0, 3).equals("bad"))
    return true;
  
  // For checking if str is of length 4 or more, and checking if bad appears
  // starting at index 1
  if(3 < str.length() && str.substring(1, 4).equals("bad"))
    return true;
  
  // Should neither case be found, return false
  return false;
}
