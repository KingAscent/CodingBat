/*
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target with this additional constraint:
 * If a value in the array is chosen to be in the group, the value immediately
 * following it in the array must not be chosen. (No loops needed.)
 */

public boolean groupNoAdj(int start, int[] nums, int target) {
  // Base case
  if(nums.length <= start)
    return target == 0;
  
  // If the value is used, return and skip the element after it
  if(groupNoAdj(start + 2, nums, target - nums[start]))
    return true;
  
  // Value is not used, just increase start by 1
  return groupNoAdj(start +1, nums, target);
}
