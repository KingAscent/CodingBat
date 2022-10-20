/*
 * Given an array of ints, return true if the array contains a 2 next to a 2
 * or a 4 next to a 4, but not both.
 */

public boolean either24(int[] nums) {
  // Initialize if a 2 or 4 is next to another 2 or 4
  boolean next2 = false;
  boolean next4 = false;
  
  // Check if each element is either next to a 2 or a 4
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2)
      next2 = true;
    if(nums[i] == 4 && nums[i + 1] == 4)
      next4 = true;
  }
  
  // return if a 2 next to a 2 or a 4 next to a 4 is found
  return next2 != next4;
}
