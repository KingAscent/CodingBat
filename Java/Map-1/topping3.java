/*
 * Given a map of food keys and topping values, modify and return the map as
 * follows: if the key "potato" has a value, set that as the value for the key
 * "fries". If the key "salad" has a value, set that as the value for the key
 * "spinach".
 */

public Map<String, String> topping3(Map<String, String> map) {
  // If potato exists in the map, set fries to the same value
  if(map.containsKey("potato"))
    map.put("fries", map.get("potato"));
  
  // If salad exists in the map, set spinach to the same value
  if(map.containsKey("salad"))
    map.put("spinach", map.get("salad"));
  
  // Return the map
  return map;
}
