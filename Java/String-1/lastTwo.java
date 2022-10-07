/*
 * Given a string of any length, return a new string where the last
 * 2 chars, if present, are swapped, so "coding" yields "codign".
 */

public String lastTwo(String str) {
  // Check if str is of length 1 or less
  if(str.length() < 2)
    return str;
  
  // Get the string up until the last 2 chars
  String front = str.substring(0, str.length() - 2);
  
  // Get the last char in the string, then append the second to last char
  String back = Character.toString(str.charAt(str.length() - 1));
  back += Character.toString(str.charAt(str.length() - 2));
  
  return front + back;
}
