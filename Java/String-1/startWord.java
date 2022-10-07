/*
 * Given a string and a second "word" string, we'll say that the
 * word matches the string if it appears at the front of the string,
 * except its first char does not need to match exactly. On a match,
 * return the front of the string, or otherwise return the empty string.
 * So, so with the string "hippo" the word "hi" returns "hi" and "xip"
 * returns "hip". The word will be at least length 1.
 */

public String startWord(String str, String word) {
  // While not required, assigning the length of word to a variable makes
  // the code much easier to read
  int max = word.length();
  
  // Make sure that the word length is greater than 1 and the str length
  // is greater or equal to the word length, otherwise return an empty string
  if(1 <= max && max <= str.length()){
    // Checks to see if the front matches the word, with the exception of
    // the first char
    if(str.substring(1, max).equals(word.substring(1, max)))
      return str.substring(0, max);
  }
  return "";
}
