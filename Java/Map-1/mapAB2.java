/*
 * Modify and return the given map as follows: if the keys "a" and "b" are both
 * in the map and have equal values, remove them both.
 */

public Map<String, String> mapAB2(Map<String, String> map) {
  // Check if a and b are in the map
  if(map.containsKey("a") && map.containsKey("b")){
    String aValue = map.get("a");
    String bValue = map.get("b");
  
    // Check if a and b are of equal value
    if(aValue.equals(bValue)){
      map.remove("a");
      map.remove("b");
    }
  }
  
  // Return the map
  return map;
}
