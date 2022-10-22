/*
 * Say that a "clump" in an array is a series of 2 or more adjacent elements
 * of the same value. Return the number of clumps in the given array.
 */

public int countClumps(int[] nums) {
  // Initialize a value to keep track of all the clumps
  // Initialize a boolean value to indicate if we are in a clump
  int clumps = 0;
  boolean isClump = false;
  
  // Go over the array, checking if each value and the one after are a clump
  for(int i = 0; i < nums.length - 1; i++){
    // If we have found a clump, increase the clumps count and update the boolean
    if(nums[i] == nums[i + 1] && !isClump){
      isClump = true;
      clumps++;
    }
    // Once the end of this clump is found, update the boolean value to false
    if(nums[i] != nums[i + 1] && isClump)
      isClump = false;
  }
  
  // Return the count of clumps
  return clumps;
}
