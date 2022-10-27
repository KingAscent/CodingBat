/*
 * Modify and return the given map as follows: if the key "a" has a value, set
 * the key "b" to have that same value. In all cases remove the key "c", leaving
 * the rest of the map unchanged.
 */

public Map<String, String> mapShare(Map<String, String> map) {
  // Check if "a" has a key, then set "b" to the same value
  if(map.containsKey("a")){
    map.put("b", map.get("a"));
  }
  
  // remove "c"
  map.remove("c");
  
  // Return the map
  return map;
}
