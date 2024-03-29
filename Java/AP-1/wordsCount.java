/*
 * Given an array of strings, return the count of the number of strings with the
 * given length.
 */

public int wordsCount(String[] words, int len) {
  int count = 0;
  
  // Go over the array looking for strings of the same length
  for(int i = 0; i < words.length; i++){
    if(words[i].length() == len)
      count++;
  }
  
  // Return count
  return count;
}
