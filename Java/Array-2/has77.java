/*
 * Given an array of ints, return true if the array contains two 7's next to
 * each other, or there are two 7's separated by one element, such as
 * with {7, 1, 7}.
 */

public boolean has77(int[] nums) {
  // Go over the array, looking for a 7 next to, or separated only by one
  // element from another 7
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 7 && nums[i + 1] == 7)
      return true;
    if(i <= nums.length - 3 && nums[i] == 7 && nums[i + 2] == 7)
      return true;
  }
  
  // No 7 was found next to, or separated only by one element from another 7
  return false;
}
