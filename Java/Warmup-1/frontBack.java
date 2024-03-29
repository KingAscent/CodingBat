/*
 * Given a string, return a new string where the first and last chars have been exchanged.
 */

public String frontBack(String str) {
  if(str.length() <= 1){
    return str;
  }
  char start = str.charAt(0);
  char end = str.charAt(str.length() - 1);
  return end + str.substring(1, str.length() - 1) + start;
}
