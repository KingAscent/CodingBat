/*
 * Given a string, does "xyz" appear in the middle of the string? To
 * define middle, we'll say that the number of chars to the left and
 * right of the "xyz" must differ by at most one. This problem is
 * harder than it looks.
 */

public boolean xyzMiddle(String str) {
  // Filter out strings that are too small
  if(str.length() < 3)
    return false;
  
  // Find the start of the middle of the string
  int middle = str.length() / 2 - 1;
  
  // Return based on whether or not we are working with an even or odd length
  return str.substring(middle, middle + 3).equals("xyz") ||
         (str.length() % 2 == 0 && str.substring(middle - 1, 
         middle + 2).equals("xyz"));
}
