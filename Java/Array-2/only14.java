/*
 * Given an array of ints, return true if every element is a 1 or a 4.
 */

public boolean only14(int[] nums) {
  // Go over the array, if a number is not 1 or 4 return false
  for(int i = 0; i < nums.length; i++){
    if(nums[i] != 1 && nums[i] != 4)
      return false;
  }
  
  // Only 1's and 4's were found, return true
  return true;
}
