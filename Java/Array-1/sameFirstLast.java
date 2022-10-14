/*
 * Given an array of ints, return true if the array is length 1 or more, and
 * the first element and the last element are equal.
 */

public boolean sameFirstLast(int[] nums) {
  return (1 <= nums.length && nums[0] == nums[nums.length - 1]);
}