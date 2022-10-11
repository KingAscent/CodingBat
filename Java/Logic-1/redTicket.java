/*
 * You have a red lottery ticket showing ints a, b, and c, each of which
 * is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise
 * if they are all the same, the result is 5. Otherwise so long as both b
 * and c are different from a, the result is 1. Otherwise the result is 0.
 */

public int redTicket(int a, int b, int c) {
  // Check if a, b, and c are the value 2
  if(a == 2 && b == 2 & c == 2)
    return 10;
  
  // Check if a, b, and c are the same value
  if(a == b & b == c)
    return 5;
  
  // Check if b and c are different from a
  if(a != b && a != c)
    return 1;
  
  // In all other cases, return 0
  return 0;
}
