/*
 * Returns true if for every '*' (star) in the string, if there are
 * chars both immediately before and after the star, they are the same.
 */

public boolean sameStarChar(String str) {
  // Find when the * appears
  for(int i = 1; i < str.length() - 1; i++){
    // Since a blank string passes true, find the condition in which the code
    // should return false
    if(str.charAt(i) == '*' && str.charAt(i - 1) != (str.charAt(i + 1)))
      return false;
  }
  return true;
}
