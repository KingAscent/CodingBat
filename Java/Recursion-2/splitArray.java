/*
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sums of the two groups are the same. Every int must be in one
 * group or the other. Write a recursive helper method that takes whatever
 * arguments you like, and make the initial call to your recursive helper
 * from splitArray(). (No loops needed.)
 */

public boolean splitArray(int[] nums) {
  // Call splitHelper, putting in the left side sum, right side sum, starting
  // index, and the nums array. Start at 0 for both sums and pass the array
  return splitHelper(0, 0, 0, nums);
}

public boolean splitHelper(int start, int left, int right, int[] nums) {
  // Base case
  if(nums.length <= start)
    return left == right;
  
  return splitHelper(start + 1, left + nums[start], right, nums) ||
         splitHelper(start + 1, left, right + nums[start], nums);
  
}
