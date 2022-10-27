/*
 * Given an array of non-empty strings, return a Map<String, String> with a key
 * for every different first character seen, with the value of all the strings
 * starting with that character appended together in the order they appear in
 * the array.
 */

public Map<String, String> firstChar(String[] strings) {
  // Create a map
  Map<String, String> map = new HashMap();
  
  // Go over the array, setting up each key for the map
  for(int i = 0; i < strings.length; i++){
    String startingChar = Character.toString(strings[i].charAt(0));
    
    // Make sure the character has not already been placed into the map keys
    if(!map.containsKey(startingChar)){
      String append = "";
      
      // Go over the array with a second pointer to compare following strings
      for(int j = i; j < strings.length; j++){
        if(startingChar.charAt(0) == strings[j].charAt(0))
          append += strings[j];
      }
      
      // Add the key and value into the map
      map.put(startingChar, append);
    }
  }
  
  // Return the map
  return map;
}
