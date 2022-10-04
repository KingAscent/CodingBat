/*
 * Given an array of ints, return true if one of the first 4 elements 
 * in the array is a 9. The array length may be less than 4.
 */

public boolean arrayFront9(int[] nums) {
  int size = nums.length;
  // In the event the array length is larger than 4, check only first 4
  if(4 < size)
    size = 4;
  for(int i = 0; i < size; i++){
    if(nums[i] == 9)
      return true;
  }
  return false;
}
