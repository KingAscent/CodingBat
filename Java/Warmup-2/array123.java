/* 
 * Given an array of ints, return true if the sequence 
 * of numbers 1, 2, 3 appears in the array somewhere.
 */

public boolean array123(int[] nums) {
  // Returns false if any array is of length 2 or less
  if(nums.length < 3)
    return false; 
  
  // Iterates over the array up to the last 3 digits, and checks
  // if any up to and including the last 3 are in sequence 1, 2, 3
  for(int i = 0; i < nums.length - 2; i++){
    if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
      return true;
    }
  }
  return false;
}
