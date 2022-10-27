/*
 * The classic word-count algorithm: given an array of strings, return a
 * Map<String, Integer> with a key for each different string, with the value
 * the number of times that string appears in the array.
 */

public Map<String, Integer> wordCount(String[] strings) {
  // Create a map
  Map<String, Integer> map = new HashMap();
  
  // Go over the array, counting each appearance of a string before placing
  // it into the map
  for(int i = 0; i < strings.length; i++){
    int count = 0;
    String first = strings[i];
    
    // Go over the rest of the array comparing the following strings to the
    // first string
    for(int j = i; j < strings.length; j++){
      if(strings[i] == strings[j])
        count++;
    }
    
    // Place the string and its count into the map, only if it is not already
    // in the map
    if(!map.containsKey(strings[i]))
      map.put(first, count);
  }
  
  // Return the map
  return map;
}
