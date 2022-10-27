/*
 * We'll say that 2 strings "match" if they are non-empty and their first chars
 * are the same. Loop over and then return the given array of non-empty strings
 * as follows: if a string matches an earlier string in the array, swap the 2
 * strings in the array. A particular first char can only cause 1 swap, so once
 * a char has caused a swap, its later swaps are disabled. Using a map, this can
 * be solved making just one pass over the array. More difficult than it looks.
 */

public String[] firstSwap(String[] strings) {
  // Create a map to contain what keys have been used
  Map<Character, Integer> map = new HashMap();
  
  // Go over the array, looking for keys that need to be swapped and have not
  // yet been used. If a key has a value "null", it has been used to swap
  for(int i = 0; i < strings.length; i++){
    if(!map.containsKey(strings[i].charAt(0))){ // First time key is seen
      map.put(strings[i].charAt(0), i);
    }else{
      if(map.get(strings[i].charAt(0)) != null){ // Key is in map, has not swapped
        int index = map.get(strings[i].charAt(0));
        String temp = strings[index];
        strings[index] = strings[i];
        strings[i] = temp;
        map.put(strings[i].charAt(0), null); // Key is there and has been swapped
      }
    }
  }
  
  // Return the string array
  return strings;
}
