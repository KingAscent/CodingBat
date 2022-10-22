/*
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array.
 * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes
 * {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 */

public int[] zeroFront(int[] nums) {
  // Keep track of the zeros in the array
  int zeros = 0;
  
  // Go over the array, when a zero is found, shift the array over and move
  // the zero to the front of the array
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 0){
      nums[i] = nums[zeros];
      nums[zeros] = 0;
      zeros++;
    }
  }
  
  // Return the modified array
  return nums;
}
