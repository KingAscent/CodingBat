/*
 *Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 */

boolean doubleX(String str) {
  int firstX = str.indexOf("x");   // indexOf returns -1 if no "x"
  
  // If no "x" or if string is only 1 character or less long, 
  // or if x is the last character in the string
  // returns false
  if((firstX == -1) || (str.length() <= 1) || (firstX == str.length() - 1))
    return false;
  
  return (str.substring(firstX, firstX + 2).equals("xx"));
}
