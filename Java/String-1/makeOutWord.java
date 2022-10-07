/*
 * Given an "out" string length 4, such as "<<>>", and a word,
 * return a new string where the word is in the middle of the
 * out string, e.g. "<<word>>". Note: use str.substring(i, j) to
 * extract the String starting at index i and going up to but not 
 * including index j.
 */

public String makeOutWord(String out, String word) {
  // Can just do 0, 2 & 2, 4 for finding the front and back,
  // but this makes it so the code can be easily modified to include
  // out strings of of larger than length 4. 
  String front = out.substring(0, out.length() / 2);
  String back = out.substring(out.length() / 2, out.length());
  return front + word + back;
}
