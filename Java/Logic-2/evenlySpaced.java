/*
 * Given three ints, a b c, one of them is small, one is medium and one is
 * large. Return true if the three values are evenly spaced, so the
 * difference between small and medium is the same as the difference
 * between medium and large.
 */

public boolean evenlySpaced(int a, int b, int c) {
  // Create an array to place the integers into
  int[] nums = new int[3];
  
  // Place the integers into the array, and then sort it from least to greatest
  nums[0] = a;
  nums[1] = b;
  nums[2] = c;
  Arrays.sort(nums);
  
  // Return if the distance between the intgers is evenly distributed
  return nums[2] - nums[1] == nums[1] - nums[0];
}
