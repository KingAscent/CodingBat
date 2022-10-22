/*
 * We'll say that an element in an array is "alone" if there are values
 * before and after it, and those values are different from it. Return a
 * version of the given array where every instance of the given value
 * which is alone is replaced by whichever value to its left or right is larger.
 */

public int[] notAlone(int[] nums, int val) {
  // Filter out arrays of length 2 or less
  if(nums.length <= 2)
    return nums;
  
  // Go over the array, if val is found then compare numbers around it to see
  // which is larger and will replace it
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == val && i != 0 && i != nums.length - 1){
      nums[i] = Math.max(nums[i - 1], nums[i + 1]);
      i++;
    }
  }
  
  // Return nums
  return nums;
}
