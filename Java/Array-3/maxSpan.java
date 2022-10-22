/*
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span
 * found in the given array. (Efficiency is not a priority.)
 */

public int maxSpan(int[] nums) {
  // Keep track of the largest window of span
  int max = 0;
  
  // Go over the array, looking at every single value
  for(int i = 0; i < nums.length; i++){
    int firstInstance = i;
    
    // Go over the array, checking when is the last instance of of nums[i]
    int lastInstance = 0;
    for(int j = i; j < nums.length; j++){
      if(nums[i] == nums[j]){
        lastInstance = j;
      }
    }
    
    // Check if this window is larger than the max
    max = Math.max(lastInstance - i + 1, max);
    
    // Reset lastInstance
    lastInstance = 0;
  }
  
  // Return the largest span
  return max;
}
