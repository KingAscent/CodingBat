/*
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * beginning at the start index, such that the group sums to the given target?
 * However, with the additional constraint that all 6's must be chosen.
 * (No loops needed.)
 */

public boolean groupSum6(int start, int[] nums, int target) {
  // Base case
  if(nums.length <= start)
    return target == 0;
  
  // If the element is 6, it must be subtracted from target
  if(nums[start] == 6)
    return groupSum6(start + 1, nums, target - 6);
  
  // Return depending on if subtracting the element helps reduce target to 0
  return groupSum6(start + 1, nums, target) || 
         groupSum6(start + 1, nums, target - nums[start]);
}
