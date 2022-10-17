/*
 * Given 3 int values, a b c, return their sum. However, if any of the values
 * is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
 * except 15 and 16 do not count as a teens. Write a separate helper "public
 * int fixTeen(int n) {"that takes in an int value and returns that value
 * fixed for the teen rule. In this way, you avoid repeating the teen code
 * 3 times (i.e. "decomposition"). Define the helper below and at the same
 * indent level as the main noTeenSum().
 */

public int noTeenSum(int a, int b, int c) {
  int sum = 0;
  
  // Call fixTeen to see if the value should be added to the sum
  sum += fixTeen(a);
  sum += fixTeen(b);
  sum += fixTeen(c);
  
  // Return the sum
  return sum;
}

public int fixTeen(int n) {
  // Check to see if n is in the range 13, 19 inclusive. If it is,
  // make sure it is not 15 or 16
  if(13 <= n && n <= 19 && n != 15 && n != 16){
    return 0;
  }else{
    return n;
  }
}
