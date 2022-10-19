/*
 * Given an array length 1 or more of ints, return the difference between the
 * largest and smallest values in the array. Note: the built-in
 * Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger
 * of two values.
 */

public int bigDiff(int[] nums) {
  // Initialize the smallest and largest values
  int largest = 0;
  int smallest = nums[0];
  
  // Go over the array, keeping track of the smallest and largest values
  for(int i = 0; i < nums.length; i++){
    largest = Math.max(largest, nums[i]);
    smallest = Math.min(smallest, nums[i]);
  }
  
  // Return the difference between the smallest and largest values
  return largest - smallest;
}
