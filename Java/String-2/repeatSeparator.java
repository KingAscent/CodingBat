/*
 * Given two strings, word and a separator sep, return a big string made of
 * count occurrences of the word, separated by the separator string.
 */

public String repeatSeparator(String word, String sep, int count) {
  String repeat = "";
  // Check to see if count is 0, then return the blank repeat string
  if(count == 0)
    return repeat;
  
  // Repeat the word followed by the separator, until there is 1 repeat left
  // Start at i = 1 so that we can add the last repeat without the separator
  for(int i = 1; i < count; i++){
    repeat += word + sep;
  }
  repeat += word;
  return repeat;
}
