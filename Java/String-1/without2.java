/*
 * Given a string, if a length 2 substring appears at both its beginning and
 * end, return a string without the substring at the beginning, so "HelloHe"
 * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
 * Otherwise, return the original string unchanged.
 */

public String without2(String str) {
  // Checks if the string is of length 2 or more, then checks if the 2 chars
  // at the front match the 2 at the end. Returns the omitted string if needed
  if(2 <= str.length() && 
      str.substring(0, 2).equals(str.substring(str.length() - 2)))
    return str.substring(2);
  
  // If the string has a length of 2 or less, or the 2 chars in the front do not
  // match the 2 at the end, returns the string unchanged. 
  return str;
}
