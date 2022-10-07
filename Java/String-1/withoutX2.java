/*
 * Given a string, if one or both of the first 2 chars is 'x', return the
 * string without those 'x' chars, and otherwise return the string unchanged.
 * This is a little harder than it looks.
 */

public String withoutX2(String str) {
  // Filter out strings that are just 1 length "x"
  if(str.length() == 1 && str.charAt(0) == 'x')
    return "";
  
  // Check all the cases of strings that are of length 2 or more
  if(2 <= str.length()){
    // Check the second char to see if it is an x
    if(str.charAt(1) == 'x'){
      if(str.charAt(0) == 'x')
      // If both the first and second char is an x, return the omitted string
        return str.substring(2);
        
      // If only the second char is x, omit it and return the string
      return str.charAt(0) + str.substring(2);
    }
    
    // The second char is not x, therefore check the first x
    if(str.charAt(0) == 'x')
      return str.substring(1);
  }
  
  // If the cases above do not apply to the string, return it unchanged
  return str;
}
