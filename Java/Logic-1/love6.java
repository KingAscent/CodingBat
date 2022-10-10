/*
 * The number 6 is a truly great number. Given two int values, a and b, return
 * true if either one is 6. Or if their sum or difference is 6.
 * Note: the function Math.abs(num) computes the absolute value of a number.
 */

public boolean love6(int a, int b) {
  // Check to see if a or b are 6, or if their difference or sum is 6
  if(a == 6 || b == 6 || Math.abs(a - b) == 6 || (a + b) == 6)
    return true;
  
  // If none of the cases above are true, return false
  return false;
}
