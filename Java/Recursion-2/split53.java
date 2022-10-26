/*
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of the two groups is the same, with these constraints: all
 * the values that are multiple of 5 must be in one group, and all the values
 * that are a multiple of 3 (and not a multiple of 5) must be in the other.
 * (No loops needed.)
 */

public boolean split53(int[] nums) {
  // Call split53Helper, putting in the starting index, left sum, right sum,
  // and the nums array. Start at 0 for both sums and pass the array
  return split53Helper(0, 0, 0, nums);
}

public boolean split53Helper(int start, int left, int right, int[] nums) {
  // Base case
  if(nums.length <= start)
    return (left == right);
  
  // If multiple of 3, add it to the left side
  if(nums[start] % 3 == 0)
    return split53Helper(start + 1, left + nums[start], right, nums);
  
  // If multiple of 5, add it to the right side
  if(nums[start] % 5 == 0)
    return split53Helper(start + 1, left, right + nums[start], nums);
  
  // If not a multiple of 3 or 5, add it to either side
  return split53Helper(start + 1, left + nums[start], right, nums) ||
         split53Helper(start + 1, left, right + nums[start], nums);
}
