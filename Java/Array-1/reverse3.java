/*
 * Given an array of ints length 3, return a new array with the elements
 * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 */

public int[] reverse3(int[] nums) {
  return new int[]{nums[2], nums[1], nums[0]};
}
  /* 
   * While this is much simpler to do without a loop, a loop provides a more
   * generic solution
   * int[] reverseNums = new int[nums.length];
   * for(int i = nums.length - 1; 0 <= i; i--){
   * reverseNums[nums.length - i - 1] = nums[i];
   * }
   * return reverseNums;
   */
