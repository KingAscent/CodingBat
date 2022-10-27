/*
 * We'll say that 2 strings "match" if they are non-empty and their first chars
 * are the same. Loop over and then return the given array of non-empty strings
 * as follows: if a string matches an earlier string in the array, swap the 2
 * strings in the array. When a position in the array has been swapped, it no
 * longer matches anything. Using a map, this can be solved making just one pass
 * over the array. More difficult than it looks.
 */

public String[] allSwap(String[] strings) {
  // Create a map
  Map<Character, Integer> map = new HashMap();
  
  // Go over the array, looking for keys that we have encountered previously and
  // need to swap
  for(int i = 0; i < strings.length; i++){
    if(!map.containsKey(strings[i].charAt(0))){ // First time seeing this key
      map.put(strings[i].charAt(0), i);
    }else{                                      // We've seen this key before
      int index = map.get(strings[i].charAt(0));
      String firstWord = strings[index];
      strings[index] = strings[i];
      strings[i] = firstWord;
      map.remove(strings[i].charAt(0)); // Remove the key for further use
    }
  }
  
  // Return strings
  return strings;
}
