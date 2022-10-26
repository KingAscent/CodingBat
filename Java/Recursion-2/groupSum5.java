/*
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target with these additional
 * constraints: all multiples of 5 in the array must be included in the group.
 * If the value immediately following a multiple of 5 is 1, it must not be
 * chosen. (No loops needed.)
 */

public boolean groupSum5(int start, int[] nums, int target) {
  // Base case
  if(nums.length <= start)
    return target == 0;
  
  // Check if element is a multiple of 5 AND NOT followed by 1
  if(nums[start] % 5 == 0){
    if(start + 1 < nums.length && nums[start + 1] == 1)
      return groupSum5(start + 2, nums, target - nums[start]);
    return groupSum5(start + 1, nums, target - nums[start]);
  }
  
  if(groupSum5(start + 1, nums, target - nums[start]))
    return true;
  
  return groupSum5(start + 1, nums, target);
}
