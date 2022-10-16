/*
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky"
 * 1. Return true if the given array contains an unlucky 1 in the first 2
 * or last 2 positions in the array.
 */

public boolean unlucky1(int[] nums) {
  // Filter out arrays of length 1 or less
  if(nums.length <= 1)
    return false;
  
  // See if there is a 1 in the first or second element, followed by a 3
  if((nums[0] == 1 && nums[1] == 3) || (3 <= nums.length &&
          nums[1] == 1 && nums[2] == 3))
    return true;
  
  // Since there was no unlucky 1 found in the first 2 indeces, return if there
  // is an unlucky 1 in the last 2 indeces
  return (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
}
