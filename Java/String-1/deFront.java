/*
 * Given a string, return a version without the first 2 chars. 
 * Except keep the first char if it is 'a' and keep the second char if it 
 * is 'b'. The string may be any length. Harder than it looks.
 */

public String deFront(String str) {
  // Filter out strings with a length less than 2
  if(str.length() < 2 && str.charAt(0) != 'a')
    return "";
  
  // Return the omitted string if the first 2 chars are not a or b
  if(str.charAt(0) != 'a' && str.charAt(1) != 'b')
    return str.substring(2);
  
  // By now, either the first or second char is a or b, respectively
  // Omit the first or second char as needed
  if(str.charAt(0) == 'a'){
    if(str.charAt(1) == 'b')
      return str;     // a and b are the first 2 chars, respectively
    return str.charAt(0) + str.substring(2);    // b was not the second char
  }
  
  // b was the second char, but a was not the first char
  return str.substring(1);

}
