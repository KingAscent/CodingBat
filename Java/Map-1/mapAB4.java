/*
 * Modify and return the given map as follows: if the keys "a" and "b" have
 * values that have different lengths, then set "c" to have the longer value.
 * If the values exist and have the same length, change them both to the empty
 * string in the map.
 */

public Map<String, String> mapAB4(Map<String, String> map) {
  // Check if a and b have values in the map
  if(map.containsKey("a") && map.containsKey("b")){
    // Compare the lengths of a and b
    String aValue = map.get("a");
    String bValue = map.get("b");
    if(aValue.length() == bValue.length()){
      map.put("a", "");
      map.put("b", "");
    }
    if(aValue.length() < bValue.length())
      // b is longer, therefore place b's value into c
      map.put("c", map.get("b"));
    
    if(bValue.length() < aValue.length())
    // a is longer, therefore place a into c
      map.put("c", map.get("a"));
  }
  
  // Return the map
  return map;
}
