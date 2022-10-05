/*
 * Given 2 positive int values, return the larger value that is in the range 10..20
 * inclusive, or return 0 if neither is in that range.
 */

public int max1020(int a, int b) {
  if(10 <= a && a <= 20 && 10 <= b && b <= 20){
    if(b < a)
      return a;
    return b;
  }
  if(10 <= a && a <= 20)
    return a;
  if(10 <= b && b <= 20)
    return b;
  return 0;
}
