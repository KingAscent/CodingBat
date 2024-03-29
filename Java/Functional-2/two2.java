/*
 * Given a list of non-negative integers, return a list of those numbers
 * multiplied by 2, omitting any of the resulting numbers that end in 2.
 */

public List<Integer> two2(List<Integer> nums) {
  // Multiply all the integers by 2, then remove any that end in 2
  nums.replaceAll(n -> n * 2);
  nums.removeIf(n -> n % 10 == 2);
  return nums;
}
