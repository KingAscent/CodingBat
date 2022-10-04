/* 
 * Given a string, return the count of the number of times 
 * that a substring length 2 appears in the string and also 
 * as the last 2 chars of the string, so "hixxxhi" yields 1 
 * (we won't count the end substring).
 */

public int last2(String str) {
  int count = 0;
  // If we have a string of only length 2, return 0
  if(str.length() <= 2)
    return count;
  
  // substring(str.length() - 2) will start counting from the back
  String end = str.substring(str.length() - 2);
  
  // Iterate over the string for 2 characters before the end. 
  for(int i = 0; i < str.length() - 2; i++){
    if(str.substring(i, i + 2).equals(end))
      count++;
  }
  return count;
}
