/*
 * Given an array of ints of even length, return a new array length 2
 * containing the middle two elements from the original array.
 * The original array will be length 2 or more.
 */

public int[] makeMiddle(int[] nums) {
  if(nums.length == 2)
    return nums;
  
  // Find the middle of the array
  int middle = nums.length / 2;
  
  // Return an array using the 2 middle values
  return new int[]{nums[middle - 1], nums[middle]};
}
