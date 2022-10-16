/*
 * Given an array of ints of odd length, look at the first, last,
 * and middle values in the array and return the largest. The array
 * length will be a least 1.
 */

public int maxTriple(int[] nums) {
  // Filter out arrays of length 1 and 2
  if(nums.length == 1)
    return nums[0];
  if(nums.length == 2)
    return Math.max(nums[0], nums[1]);
  
  // Find the first, middle, and last integer
  int first = nums[0];
  int middle = nums[nums.length / 2];
  int last = nums[nums.length - 1];
  
  // Compare the integers to see which one is the largest
  int largest = Math.max(first, middle);
  largest = Math.max(largest, last);
  
  // Return the largest integer
  return largest;
}
