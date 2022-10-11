/*
 * Given 2 non-negative ints, a and b, return their sum, so long as the
 * sum has the same number of digits as a. If the sum has more digits
 * than a, just return a without b. (Note: one way to compute the number
 * of digits of a non-negative int n is to convert it to a string with
 * String.valueOf(n) and then check the length of the string.)
 */

public int sumLimit(int a, int b) {
  // Get the string value of a and the sum of a + b
  String aString = String.valueOf(a);
  int sum = a + b;
  String sumString = String.valueOf(sum);
  
  // Compare the length of a and the sum of a + b, and then return a or the sum
  if(sumString.length() <= aString.length())
    return sum;
  return a;
}
