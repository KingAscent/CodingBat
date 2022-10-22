/*
 * Given an array of ints, return true if it contains no 1's or
 * it contains no 4's.
 */

public boolean no14(int[] nums) {
  boolean ones = false;
  boolean fours = false;
  
  // Go over the array, checking to see if there is a one or a four
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1)
      ones = true;
    if(nums[i] == 4)
      fours = true;
  }
  
  // No 1 or 4 was found, return true
  return (ones != fours) || (!ones && !fours);
}
