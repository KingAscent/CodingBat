/*
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2)
 * ... 1. Compute the result recursively (without loops).
 */

public int factorial(int n) {
  // If n is 1, return n
  if(n == 1)
    return n;
  
  // Otherwise, continue calling this method until n == 1
  else return n * factorial(n - 1);
}
