/*
 * Given 3 int values, a b c, return their sum. However, if one of the values
 * is the same as another of the values, it does not count towards the sum.
 */

public int loneSum(int a, int b, int c) {
  if(a == b || a == c || b == c){
    if(a == b && a == c && b == c)
      return 0;
    if(a == b && a != c && b != c)
      return c;
    if(b == c && a != b && a != b)
      return a;
    if(a == c && a != b && b != c)
      return b;
  }
  return a + b + c;
}
