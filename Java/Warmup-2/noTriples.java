/*
 * Given an array of ints, we'll say that a triple is a
 * value appearing 3 times in a row in the array.
 * Return true if the array does not contain any triples.
 */

public boolean noTriples(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++){
  
    // Compares the integer to the 2 that follow it to see if they are the same
    if(nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
    return false;
  }
  return true;
}
