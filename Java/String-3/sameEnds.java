/*
 * Given a string, return the longest substring that appears at both the
 * beginning and end of the string without overlapping. For example,
 * sameEnds("abXab") is "ab".
 */

public String sameEnds(String string) {
  // Initialzie a string that keeps track of the longest substring
  String longest = "";
  
  // Go over the string, looking for when the start is the same as the end
  for(int i = 0; i < string.length() / 2 + 1; i++){
    if(string.substring(0, i).equals(string.substring(string.length() - i))){
      longest = string.substring(0, i);
    }
  }
  
  // Return the longest substring
  return longest;
}
