/*
 * Return a version of the given string, where for every star (*) in the
 * string the star and the chars immediately to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 */

public String starOut(String str) {
  String starOut = "";
  
  // Find the *'s in the string, and then remove the chars around them
  // If a character isn't a * and isn't preceding or immediately after a *,
  // add it to starOut
  for(int i = 0; i < str.length(); i++){
    if(i == 0 && str.charAt(i) != '*')
      starOut += str.charAt(i);
    
    if(0 < i && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
      starOut += str.charAt(i);
    
    if(0 < i && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
      starOut = starOut.substring(0, starOut.length() - 1);
  }
  return starOut;
}
