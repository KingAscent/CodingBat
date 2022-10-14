/*
 * Given a string and a non-empty word string, return a string made of each
 * char just before and just after every appearance of the word in the string.
 * Ignore cases where there is no char before or after the word, and a char
 * may be included twice if it is between two words.
 */

public String wordEnds(String str, String word) {
  String wordEnds = "";
  
  // Go over the string looking for word, adding substrings to wordEnds if
  // they fit the criteria
  for(int i = 0; i < str.length() - word.length() + 1; i++){
    if(0 < i && str.substring(i, i + word.length()).equals(word))
      wordEnds += str.substring(i - 1, i);
    if(i < str.length() - word.length() &&
            str.substring(i, i + word.length()).equals(word))
      wordEnds += str.substring(i + word.length(), i + word.length() + 1);
  }
  
  return wordEnds;
}
