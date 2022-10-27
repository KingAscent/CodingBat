/*
 * Given a map of food keys and topping values, modify and return the map as
 * follows: if the key "ice cream" is present, set its value to "cherry".
 * In all cases, set the key "bread" to have the value "butter".
 */

public Map<String, String> topping1(Map<String, String> map) {
  // Check if the key "ice cream" exists, and set it to cherry
  if(map.containsKey("ice cream"))
    map.put("ice cream", "cherry");
  
  // Set bread to butter
  map.put("bread", "butter");
  
  // Return the map
  return map;
}
