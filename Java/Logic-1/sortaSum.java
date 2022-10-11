/*
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19
 * inclusive, are forbidden, so in that case just return 20.
 */

public int sortaSum(int a, int b) {
  // Check to see if a + b is in the range 10 to 19 inclusive, otherwise return
  // their sum
  if(10 <= (a + b) && (a + b) <= 19)
    return 20;
  return a + b;
}
