/*
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting
 * with 'z' and ending with 'p'. Return a string where for all such words,
 * the middle letter is gone, so "zipXzap" yields "zpXzp".
 */

public String zipZap(String str) {
  // Filter out strings of length less than 2
  if(str.length() <= 2)
    return str;
  
  String zipZap = "";
  
  // Look for z_pz_ps in the string, and add them to zipZap
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'){
      zipZap += str.charAt(i);
      zipZap += str.charAt(i + 2);
      i += 2;
    }else{
      zipZap += str.charAt(i);
    }
  }
  
  return zipZap;
}
