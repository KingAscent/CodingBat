/*
 * Given an array of strings, return a Map<String, Integer> containing a key for
 * every different string in the array, and the value is that string's length.
 */

public Map<String, Integer> wordLen(String[] strings) {
  // Initialize a map that will be returned
  Map<String, Integer> map = new HashMap();
  
  // Go over the array, placing each string and its length into the map
  for(int i = 0; i < strings.length; i++){
    map.put(strings[i], strings[i].length());
  }
  
  // Return the map
  return map;
}
