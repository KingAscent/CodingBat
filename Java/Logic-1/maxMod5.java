/*
 * Given two int values, return whichever value is larger. However if the two
 * values have the same remainder when divided by 5, then the return the
 * smaller value. However, in all cases, if the two values are the same,
 * return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
 */

public int maxMod5(int a, int b) {
  // Check if a and b are the same value
  if(a == b)
    return 0;
  
  // Check if a and b have the same remainder when divided by 5
  if((a % 5) == (b % 5))
    return Math.min(a, b);
  
  // If neither case above is true, return the larger value
  return Math.max(a, b);
}
