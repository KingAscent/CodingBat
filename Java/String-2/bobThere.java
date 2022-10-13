/*
 * Return true if the given string contains a "bob" string, but where
 * the middle 'o' char can be any char.
 */

public boolean bobThere(String str) {
  // Check to see if the string contains b_b anywhere
  for(int i = 0; i < str.length() - 2; i++){
    if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
      return true;
  }
  
  //Since b_b was not found, return false
  return false;
}
