/*
 * Start with two arrays of strings, a and b, each in alphabetical order,
 * possibly with duplicates. Return the count of the number of strings which
 * appear in both arrays. The best "linear" solution makes a single pass over
 * both arrays, taking advantage of the fact that they are in alphabetical order.
 */

public int commonTwo(String[] a, String[] b) {
  int count = 0;
  Map<String, Boolean> map = new HashMap();
  
  // Go over the a array, and compare each character in b
  for(int i = 0; i < a.length; i++){ // Go over the a array
    for(int j = 0; j < b.length; j++){ // Go over the b array
      if(a[i].equals(b[j]) && !map.containsKey(a[i])){
        map.put(a[i], true);
        count++;
      }
    }
  }
  
  // Return the count
  return count;
}
