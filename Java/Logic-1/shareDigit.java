/*
 * Given two ints, each in the range 10..99, return true if there is a
 * digit that appears in both numbers, such as the 2 in 12 and 23.
 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10
 * gives the right digit.)
 */

public boolean shareDigit(int a, int b) {
  // For readiability, assign the left and right digits of a and b to variables
  int aLeft = a / 10;
  int aRight = a % 10;
  int bLeft = b / 10;
  int bRight = b % 10;
  
  // Compare the digits and return true or false based on the outcome
  return aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight;
}
