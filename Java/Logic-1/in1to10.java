/*
 * Given a number n, return true if n is in the range 1..10, inclusive.
 * Unless outsideMode is true, in which case return true if the number is
 * less or equal to 1, or greater or equal to 10.
 */

public boolean in1To10(int n, boolean outsideMode) {
  // Check if outsideMode is true, and if n is outside the range of 1 to 10
  if(outsideMode && (n <= 1 || 10 <= n))
    return true;
  
  // Since outsideMode is not true, check if n is in the range of 1 to 10
  if(!outsideMode && 1 <= n && n <= 10)
    return true;
  
  // If neither case above is true, return false
  return false;
}
