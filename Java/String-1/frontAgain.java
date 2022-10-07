/*
 * Given a string, return true if the first 2 chars in the string also appear at
 * the end of the string, such as with "edited".
 */

public boolean frontAgain(String str) {
  // Filter out strings with a length less than 2
  if(str.length() < 2)
    return false;
  
  // Isolate the front 2 and back 2 chars of the string
  // While one could do this without first assigning the chars to strings, this
  // makes it much easier to read
  String front = str.substring(0, 2);
  String back = str.substring(str.length() - 2);
  
  // Checks to see if the string has the same 2 chars at the front and back
  if(front.equals(back))
    return true;
  
  //If neither cases above are found, return false
  return false;
}
