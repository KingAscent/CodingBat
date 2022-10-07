/*
 * Given a string, if the string begins with "red" or "blue" return that
 * color string, otherwise return the empty string.
 */

public String seeColor(String str) {
  // Check to see if the string starts with a color
  if(3 <= str.length() && str.substring(0, 3).equals("red"))
    return "red";
  if(4 <= str.length() && str.substring(0, 4).equals("blue"))
    return "blue";
  
  // If neither case is found, return an empty string
  return "";
}
