/*
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side.
 */

public boolean canBalance(int[] nums) {
  // Go over the array, checking if every value after the current element
  // is equal to all values before and including the current element
  int left = 0;
  for(int i = 0; i < nums.length; i++){
    // Add the current index to the left variable, keeping track of its sum
    left += nums[i];
    
    // Go over the array's right side, keeping track of its sum
    int right = 0;
    for(int j = i + 1; j < nums.length; j++){
      right += nums[j];
    }
    
    // If the array is balanced, return true. Otherwise, continue to
    // go over the array from the left side, reseting the sum of
    // the right side to 0
    if(left == right)
      return true;
  }
  
  // It is not possible to balance the array
  return false;
}
