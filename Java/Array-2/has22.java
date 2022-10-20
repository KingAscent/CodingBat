/*
 * Given an array of ints, return true if the array
 * contains a 2 next to a 2 somewhere.
 */

public boolean has22(int[] nums) {
  // Go over the array, checking if there is a 2 next to a 2
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2)
      return true;
  }
  
  // No 2 followed by a 2 was found, return false
  return false;
}
