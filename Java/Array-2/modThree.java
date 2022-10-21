/*
 * Given an array of ints, return true if the array contains either 3 even or
 * 3 odd values all next to each other.
 */

public boolean modThree(int[] nums) {
  // Go over the array looking for 3 even or odd values in sequence
  for(int i = 0; i < nums.length - 2; i++){
    if(nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
      return true;
    if(nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)
      return true;
  }
  
  // The array does not have 3 evens or 3 odd values next to each other
  return false;
}
