/*
 * Return true if the given string contains an appearance of "xyz" where
 * the xyz is not directly preceeded by a period (.). So "xxyz" counts but
 * "x.xyz" does not.
 */

public boolean xyzThere(String str) {
  // Check to see if xyz appears and is not directly preceeded by a period(.)
  // First check if xyz appears at index 0, then check the rest of the string
  if(3 <= str.length() && str.substring(0, 3).equals("xyz"))
    return true;
  
  
  for(int i = 1; i < str.length() - 2; i++){
    if(str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.')
      return true;
  }
  return false;
}
