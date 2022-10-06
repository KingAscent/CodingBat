/*
 * Suppose the string "yak" is unlucky. Given a string, return
 * a version where all the "yak" are removed, but the "a" can
 * be any char. The "yak" strings will not overlap.
 */

public String stringYak(String str) {
  String yakless = "";
  for(int i = 0; i < str.length(); i++){
    
    // To make sure the string still has 3 characters to check
    // If it does, checks if the first and third character over 
    // are 'y' and 'k', and if they are, skips appending them
    if((i + 2) < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k'){
      i += 2;
    }else{
    
      // Append to yakless as usual
      yakless += str.charAt(i);
    }
  }
  return yakless;
}
