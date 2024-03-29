/*
 * Given an array of ints, return a new array length 2 containing the first
 * and last elements from the original array. The original array will be
 * length 1 or more.
 */

public int[] makeEnds(int[] nums) {
  if(nums.length == 1)
    return new int[]{nums[0], nums[0]};
  
  return new int[]{nums[0], nums[nums.length - 1]};
}
