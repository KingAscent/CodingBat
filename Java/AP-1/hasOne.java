/*
 * Given a positive int n, return true if it contains a 1 digit. Note: use %
 * to get the rightmost digit, and / to discard the rightmost digit.
 */

public boolean hasOne(int n) {
  // Check each of the rightmost digits to see if there is a 1
  while(n != 0){
    if(n % 10 == 1)
      return true;
    n = n / 10;
  }
  
  // No 1 was found, return false
  return false;
}
