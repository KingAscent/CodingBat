/*
 * Given 3 int values, a b c, return their sum. However, if one of the values
 * is the same as another of the values, it does not count towards the sum.
 */

public int loneSum(int a, int b, int c) {
  // Check if a, b, or c equal one another
  if(a == b || a == c || b == c){
    // If all three numbers are the same, return 0
    if(a == b && a == c && b == c)
      return 0;
      
      // If only two numbers match, return the one that does not match
    if(a == b)
      return c;
    if(b == c)
      return a;
    if(a == c)
      return b;
  }
  
  // All three numbers are unique, return their sum
  return a + b + c;
}
