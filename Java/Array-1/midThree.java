/*
 * Given an array of ints of odd length, return a new array length 3
 * containing the elements from the middle of the array. The array
 * length will be at least 3.
 */

public int[] midThree(int[] nums) {
  // Find the middle of the array
  int middle = nums.length / 2;
  
  // Return the middle element, one before and one after it as well
  return new int[]{nums[middle - 1], nums[middle], nums[middle + 1]};
}
