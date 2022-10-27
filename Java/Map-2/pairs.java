/*
 * Given an array of non-empty strings, create and return a Map<String, String>
 * as follows: for each string add its first character as a key with its last
 * character as the value.
 */

public Map<String, String> pairs(String[] strings) {
  // Create a map
  Map<String, String> map = new HashMap();
  
  // Go over the array, adding the first character of each element as the key
  // and its last character as the value
  for(int i = 0; i < strings.length; i++){
    // Isolate the front and back characters
    String frontChar = Character.toString(strings[i].charAt(0));
    String backChar = Character.toString(strings[i].charAt(strings[i].length() - 1));
    
    // Place the front characters into the keys and the back characters into the values
    map.put(frontChar, backChar);
  }
  
  // Return the map
  return map;
}
