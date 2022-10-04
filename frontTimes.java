/*
 * Given a string and a non-negative int n, we'll say that the front of the 
 * string is the first 3 chars, or whatever is there if the string is less 
 * than length 3. Return n copies of the front;
 */

public String frontTimes(String str, int n) {
  String times = "";
  int charCount = str.length();
  // In the event the string is longer than 3 characters
  if(3 < charCount)
    charCount = 3;
  
  String front = str.substring(0, charCount);
  for(int i = 0; i < n; i++)
    times += front;
  return times;
}
