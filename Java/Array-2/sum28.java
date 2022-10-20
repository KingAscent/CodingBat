/*
 * Given an array of ints, return true if the sum of all the 2's in
 * the array is exactly 8.
 */

public boolean sum28(int[] nums) {
  // Keep track of the sum of all the 2's
  int sum = 0;
  
  // Go over the array, adding every 2 into the sum
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2)
      sum += nums[i];
  }
  
  // Return a boolean value of whether or not sum is exactly 8
  return sum == 8;
}
