/*
 * We'll say that a "triple" in a string is a char appearing three times in a
 * row. Return the number of triples in the given string. The triples may overlap.
 */

public int countTriple(String str) {
  // Initialize a count to keep track of the triples
  int count = 0;
  
  // Go over the string, looking for any triples
  for(int i = 0; i < str.length() - 2; i++){
    if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
      count++;
  }
  
  // Return the count
  return count;
}
