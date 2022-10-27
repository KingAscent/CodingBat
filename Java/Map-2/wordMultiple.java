/*
 * Given an array of strings, return a Map<String, Boolean> where each different
 * string is a key and its value is true if that string appears 2 or more times
 * in the array.
 */

public Map<String, Boolean> wordMultiple(String[] strings) {
  // Create a map
  Map<String, Boolean> map = new HashMap();
  
  // Go over the array, checking if each element has a key contained in map
  // If it does, continue to the next element. If not, assign a key and
  // change its value from false to true
  for(int i = 0; i < strings.length; i++){
    if(!map.containsKey(strings[i])){ // First time we've seen the key
      map.put(strings[i], false);
    }else{                           // We have seen this key before
      map.put(strings[i], true);
    }
  }
  
  // Return the map
  return map;
}
