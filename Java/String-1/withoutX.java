/*
 * Given a string, if the first or last chars are 'x', return the string
 * without those 'x' chars, and otherwise return the string unchanged.
 */

public String withoutX(String str) {
  // Filter empty strings and strings of length 1 with just an x
  if(str.length() == 0 || (str.length() < 2 && str.charAt(0) == 'x'))
    return "";
  
  // Omits any x's from the first and last chars of str
  if(str.charAt(0) == 'x')
    str = str.substring(1);
  if(str.charAt(str.length() - 1) == 'x')
    str = str.substring(0, str.length() - 1);
  
  return str;
}
