/*
 * Return true if the given non-negative number is a multiple of 3 or 5,
 * but not both. Use the % "mod" operator -- see Introduction to Mod
 */

public boolean old35(int n) {
  // Check if n is divisible by 3, or 5, and then make sure
  // that it is not divisible by both(by checking if it is divisible by 15)
  return ((n % 3 == 0) || (n % 5 == 0)) && (n % 15 != 0);
}
