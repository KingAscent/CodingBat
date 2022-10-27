/*
 * Given an array of strings, return a new array containing the first N strings.
 * N will be in the range 1..length.
 */

public String[] wordsFront(String[] words, int n) {
  // Create a new array of size n
  String[] front = new String[n];
  
  // Go over the words array, adding n elements into the new array
  for(int i = 0; i < n; i++){
    front[i] = words[i];
  }
  
  // Return the new array
  return front;
  
}
