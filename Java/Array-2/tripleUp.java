/*
 * Return true if the array contains, somewhere, three increasing
 * adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
 */

public boolean tripleUp(int[] nums) {
  // Go over the array checking if there are 3 increasing adjacent numbers
  // if so, return true
  for(int i = 0; i < nums.length - 2; i++){
    if(nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
      return true;
  }
  
  // There is no increasing adjacent numbers in the array
  return false;
}
