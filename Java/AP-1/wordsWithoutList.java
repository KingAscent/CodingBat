/*
 * Given an array of strings, return a new List (e.g. an ArrayList) where all
 * the strings of the given length are omitted. See wordsWithout() below which
 * is more difficult because it uses arrays.
 */

public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> list = new ArrayList<String>();
  
  // Go over the array, adding elements to the ArrayList
  for(int i = 0; i < words.length; i++){
    if(words[i].length() != len)
      list.add(words[i]);
  }
  
  // Return the list
  return list;
}
