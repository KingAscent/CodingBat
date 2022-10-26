/*
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target, with this additional
 * constraint: if there are numbers in the array that are adjacent and the
 * identical value, they must either all be chosen, or none of them chosen.
 * For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the
 * middle must be chosen or not, all as a group. (one loop can be used to find
 * the extent of the identical values).
 */

public boolean groupSumClump(int start, int[] nums, int target) {
  // Base case
  if(nums.length <= start)
    return target == 0;
  
  // Go over the array, if a clump is found then keep track of its sum and
  // number of index spots the clump takes up
  int sum = 0;
  int count = 0;
  
  for(int i = start; i < nums.length; i++){
    if(nums[start] == nums[i]){
      sum += nums[i];
      count++;
    }
  }
  
  // Return based on if the clump is used or not, jumping the start value
  // by how many index spots were taken up by the clump
  if(groupSumClump(start + count, nums, target - sum))
    return true;
  
  return groupSumClump(start + count, nums, target);
}
