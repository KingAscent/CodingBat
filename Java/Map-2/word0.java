/*
 * Given an array of strings, return a Map<String, Integer> containing a key for
 * every different string in the array, always with the value 0. For example the
 * string "hello" makes the pair "hello":0. We'll do more complicated counting
 * later, but for this problem the value is simply 0.
 */

public Map<String, Integer> word0(String[] strings) {
  // Create a map that will be returned
  Map<String, Integer> map = new HashMap();
  
  // Go over the array, placing each string into the map with a 0
  for(int i = 0; i < strings.length; i++){
    map.put(strings[i], 0);
  }
  
  // Return the map
  return map;
}
