/*
 * Given a list of integers, return a list of those numbers, omitting any
 * that are between 13 and 19 inclusive.
 */

public List<Integer> noTeen(List<Integer> nums) {
  // Remove any numbers in the range 13 <= n <= 19
  nums.removeIf(n -> 13 <= n  && n <= 19);
  return nums;
}
