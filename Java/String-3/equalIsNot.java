/*
 * Given a string, return true if the number of appearances of "is" anywhere in
 * the string is equal to the number of appearances of "not" anywhere in the
 * string (case sensitive).
 */

public boolean equalIsNot(String str) {
  // Keep track of the is and not count
  int isCount = 0;
  int notCount = 0;
  
  // Go over the string looking for is's and not's
  for(int i = 0; i < str.length() - 1; i++){
    if(str.substring(i, i + 2).equals("is"))
      isCount++;
    if(i + 3 <= str.length() && str.substring(i, i + 3).equals("not"))
      notCount++;
  }
  
  // Return if the amount of is's is the same as not's
  return isCount == notCount;
}
