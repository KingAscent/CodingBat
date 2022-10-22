/*
 * Return the "centered" average of an array of ints, which we'll say is
 * the mean average of the values, except ignoring the largest and smallest
 * values in the array. If there are multiple copies of the smallest value,
 * ignore just one copy, and likewise for the largest value. Use int division
 * to produce the final average. You may assume that the array is length
 * 3 or more.
 */

public int centeredAverage(int[] nums) {
  // Sort the array from least to greatest
  Arrays.sort(nums);
  
  // Go over the array to get the sum of the elements, not including the
  // first or last values (smallest or largest)
  int sum = 0;
  for(int i = 1; i < nums.length - 1; i++){
    sum += nums[i];
  }
  
  // Return the centered average
  return sum / (nums.length - 2);
}
