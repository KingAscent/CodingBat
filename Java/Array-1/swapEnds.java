/*
 * Given an array of ints, swap the first and last elements in the array.
 * Return the modified array. The array length will be at least 1.
 */

public int[] swapEnds(int[] nums) {
  // Filter out arrays of length 1
  if(nums.length == 1)
    return nums;
  
  // Use a temporary variable to placehold the last element of the array
  int temp = nums[nums.length - 1];
  
  // Move the first element to the last index, then move temp into the first
  nums[nums.length - 1] = nums[0];
  nums[0] = temp;
  
  return nums;
}
