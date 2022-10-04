/*
 * Given a string, return a version where all the "x"
 * have been removed. Except an "x" at the very start
 * or end should not be removed.
 */

public String stringX(String str) {
  String firstX = "";
  String removedXs = "";
  String lastX = "";
  
  // Check the first and last letter to see if they are x's
  // Can also just assign them to be 'x', instead of str.charAt
  if(0 < str.length() && str.charAt(0) == 'x')
    firstX += str.charAt(0);
  // If the given string is only 1 char long, the code below won't apply
  if(1 < str.length() && str.charAt(str.length() - 1) == 'x')
    lastX += str.charAt(str.length() - 1);
  
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) != 'x')
      removedXs += str.charAt(i);
  }
  return firstX + removedXs + lastX;
}
