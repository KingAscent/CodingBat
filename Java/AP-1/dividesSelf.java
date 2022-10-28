/*
 * We'll say that a positive int divides itself if every digit in the number
 * divides into the number evenly. So for example 128 divides itself since 1,
 * 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into
 * anything evenly, so no number with a 0 digit divides itself. Note: use % to
 * get the rightmost digit, and / to discard the rightmost digit.
 */

public boolean dividesSelf(int n) {
  int full = n;
  // Run this while loop as long as the rightmost digit is not 0
  while(full != 0){
    int digit = full % 10;    // The rightmost digit
    if(digit == 0 || n % digit != 0)
      return false;
    full = full / 10;
  }
  
  return true;
}
