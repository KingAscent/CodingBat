/*
 * Given a map of food keys and their topping values, modify and return the map
 * as follows: if the key "ice cream" has a value, set that as the value for the
 * key "yogurt" also. If the key "spinach" has a value, change that value to
 * "nuts".
 */

public Map<String, String> topping2(Map<String, String> map) {
  // Check if ice cream exists in the map
  if(map.containsKey("ice cream"))
    map.put("yogurt", map.get("ice cream"));
  
  // If spinach exists in the map, change its value to nuts
  if(map.containsKey("spinach"))
    map.put("spinach", "nuts");
  
  // Return the map
  return map;
}
