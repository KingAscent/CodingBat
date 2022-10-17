/*
 * Given 2 int values greater than 0, return whichever value is nearest to
 * 21 without going over. Return 0 if they both go over.
 */

public int blackjack(int a, int b) {
  // Filter out numbers over 21
  if(21 < a && 21 < b)
    return 0;
  
  // Check if a or b is over 21
  if(21 < a)
    return b;
  if(21 < b)
    return a;
  
  // Since neither is over 21, return the larger of the two
  return Math.max(a, b);
}
