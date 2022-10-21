/*
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns
 * {2, 5, 3, 6}. You may modify and return the given array, or return a
 * new array.
 */

public int[] shiftLeft(int[] nums) {
  // Filter out empty arrays
  if(nums.length == 0)
    return new int[]{};
  
  // Create a new array to place all the elements of nums into
  int[] shiftedNums = new int[nums.length];
  
  // Add every element in nums into shiftedNums except for the first one,
  // shifting the array over by 1
  for(int i = 0; i < nums.length - 1; i++){
    shiftedNums[i] = nums[i + 1];
  }
  
  // Add the first element of nums into shiftedNums and return the array
  shiftedNums[nums.length - 1] = nums[0];
  return shiftedNums;
}
