/*
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
 * immediately to its left or right. Return true if all the g's in the given
 * string are happy.
 */

public boolean gHappy(String str) {
  // Filter out strings of length 1 or less
  if(str.length() == 1)
    return false;
  
  // Go over the string, making sure every g is either followed by or following
  // another g
  for(int i = 0; i < str.length(); i++){
    // g is found, check if it is the first or last index
    if(str.charAt(i) == 'g'){
      if(i == 0 && str.charAt(i + 1) != 'g')
        return false;
      if(i == str.length() - 1 && str.charAt(i - 1) != 'g')
        return false;
      if(i != 0 && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')
        return false;
    }
  }
  
  // All g's are happy
  return true;
}
