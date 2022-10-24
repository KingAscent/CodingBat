/*
 * Given a string, look for a mirror image (backwards) string at both the
 * beginning and end of the given string. In other words, zero or more
 * characters at the very begining of the given string, and at the very
 * end of the string in reverse order (possibly overlapping). For example,
 * the string "abXYZba" has the mirror end "ab".
 */

public String mirrorEnds(String string) {
  // Keep track of the longest string
  // Have a boolean value to tell us if we are still looking at a mirrored string
  String mirror = "";
  boolean isMirror = true;
  
  // Go over the array looking for the mirrored substring
  for(int i = 0; i < string.length(); i++){
    if(string.charAt(i) != string.charAt(string.length() - i - 1) && isMirror){
      mirror = string.substring(0, i);
      isMirror = false;
    }
  }
  
  // If isMirror is still true, then the whole string mirrors itself
  if(isMirror)
    mirror = string;
  
  // Return the longest mirrored string
  return mirror;
}
