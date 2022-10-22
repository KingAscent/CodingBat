/*
 * Return a version of the given array where each zero value in the array is
 * replaced by the largest odd value to the right of the zero in the array.
 * If there is no odd value to the right of the zero, leave the zero as a zero.
 */

public int[] zeroMax(int[] nums) {
  // Go over the array, looking for zeros
  for(int i = 0; i < nums.length; i++){
    // If a zero is found, find the largest odd value to the right of the zero
    if(nums[i] == 0){
      int max = 0;
      for(int j = i; j < nums.length; j++){
        if(nums[j] % 2 != 0)
          max = Math.max(nums[j], max);
      }
      nums[i] = max;
    }
  }
  
  // Return the modified array
  return nums;
}
