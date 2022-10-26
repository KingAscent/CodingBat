/*
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of one group is a multiple of 10, and the sum of the other
 * group is odd. Every int must be in one group or the other. Write a recursive
 * helper method that takes whatever arguments you like, and make the initial
 * call to your recursive helper from splitOdd10(). (No loops needed.)
 */

public boolean splitOdd10(int[] nums) {
  // Call splitOddHelper, putting in the starting index, left sum, right sum,
  // and the nums array. Start at 0 for both sums and pass the array
  return splitOddHelper(0, 0, 0, nums);
}

public boolean splitOddHelper(int start, int left, int right, int[] nums) {
  // Base case
  if(nums.length <= start)
    return ((left % 10 == 0 && right % 2 != 0) || (left % 2 != 0 && right % 10 == 0));
  
  return splitOddHelper(start + 1, left + nums[start], right, nums) ||
         splitOddHelper(start + 1, left, right + nums[start], nums);
}
