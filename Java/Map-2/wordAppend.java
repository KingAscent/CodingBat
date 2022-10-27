/*
 * Loop over the given array of strings to build a result string like this: when
 * a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
 * to the result. Return the empty string if no string appears a 2nd time.
 */

public String wordAppend(String[] strings) {
  // Create a map to keep track of whether or not we've seen the string
  // Create a string that will be returned as the appended value
  Map<String, Integer> map = new HashMap();
  String appended = "";
  
  // Go over the array searching for the string
  for(int i = 0; i < strings.length; i++){
    if(!map.containsKey(strings[i])){ // First time we are seeing this key
      map.put(strings[i], 1);
    }else{                            // Not the first time we've seen this key
      map.put(strings[i], map.get(strings[i]) + 1);
      if(map.get(strings[i]) % 2 == 0)
        appended += strings[i];
    }
  }
  
  // Return the appended word
  return appended;
}
