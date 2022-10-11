/*
 * You have a blue lottery ticket, with ints a, b, and c on it. This makes
 * three pairs, which we'll call ab, bc, and ac. Consider the sum of the
 * numbers in each pair. If any pair sums to exactly 10, the result is 10.
 * Otherwise if the ab sum is exactly 10 more than either bc or ac sums,
 * the result is 5. Otherwise the result is 0.
 */

public int blueTicket(int a, int b, int c) {
  // For ease of reading, assign the pairs to variables
  int ab = a + b;
  int bc = b + c;
  int ac = a + c;
  
  // Check if any pairs equal 10
  if(ab == 10 || bc == 10 || ac == 10)
    return 10;
  
  // Check if ab is 10 or more than bc or ac
  if((10 <= ab - bc) || (10 <= ab - ac))
    return 5;
  
  // In all other cases, return 0
  return 0;
}
