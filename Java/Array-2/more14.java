/*
 * Given an array of ints, return true if the number of 1's is greater
 * than the number of 4's
 */

public boolean more14(int[] nums) {
  // Keep track of the 1's and 4's
  int count1 = 0;
  int count4 = 0;
  
  // Go over the array keeping count of the 1's and 4's
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1)
      count1 += 1;
    if(nums[i] == 4)
      count4 += 1;
  }
  
  // Return whether or not count1 is greater than count4
  return count4 < count1;
}
