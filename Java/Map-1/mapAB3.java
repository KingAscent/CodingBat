/*
 * Modify and return the given map as follows: if exactly one of the keys "a" or
 * "b" has a value in the map (but not both), set the other to have that same
 * value in the map.
 */

public Map<String, String> mapAB3(Map<String, String> map) {
  // Check if a is in the map and b is not
  if(map.containsKey("a") && !map.containsKey("b"))
    map.put("b", map.get("a"));
  
  // Check if b is in the map and a is not
  if(map.containsKey("b") && !map.containsKey("a"))
    map.put("a", map.get("b"));
  
  // Return the map
  return map;
}
