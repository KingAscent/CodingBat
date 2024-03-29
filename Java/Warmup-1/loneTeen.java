/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 */

public boolean loneTeen(int a, int b) {
  return ((13 <= a && a <= 19) && (b < 13 || 19 < b)) || 
         ((13 <= b && b <= 19) && (a < 13 || 19 < a)); 
}
