/*
 * For this problem, we'll round an int value up to the next multiple of 10 if
 * its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately,
 * round down to the previous multiple of 10 if its rightmost digit is less
 * than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of
 * their rounded values. To avoid code repetition, write a separate helper
 * "public int round10(int num) {" and call it 3 times. Write the helper
 * entirely below and at the same indent level as roundSum().
 */

public int roundSum(int a, int b, int c) {
  int sum = 0;
  
  // Call the round10 method, checking if the given integer should be rounded
  // up or down to the nearest multiple of 10
  sum += round10(a);
  sum += round10(b);
  sum += round10(c);
  
  // Return the sum of a, b, and c
  return sum;
}

public int round10(int n) {
  if(5 <= n % 10)
    return n - (n % 5) + 5;
  return n - (n % 5);
}
