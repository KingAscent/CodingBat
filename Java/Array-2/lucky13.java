/*
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 */

public boolean lucky13(int[] nums) {
  // Check if the array has a 1 or a 3
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1 || nums[i] == 3)
      return false;
  }
  
  // No 1 or 3 was found, return true
  return true;
}
